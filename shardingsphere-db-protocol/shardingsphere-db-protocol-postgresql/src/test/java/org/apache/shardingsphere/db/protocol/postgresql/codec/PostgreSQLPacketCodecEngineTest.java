/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.db.protocol.postgresql.codec;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.ChannelHandlerContext;
import org.apache.shardingsphere.db.protocol.postgresql.packet.identifier.PostgreSQLIdentifierPacket;
import org.apache.shardingsphere.db.protocol.postgresql.packet.identifier.PostgreSQLMessagePacketType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.LinkedList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public final class PostgreSQLPacketCodecEngineTest {
    
    @Mock
    private ChannelHandlerContext context;
    
    @Mock
    private ByteBuf byteBuf;
    
    @Test
    public void assertIsValidHeader() {
        assertTrue(new PostgreSQLPacketCodecEngine().isValidHeader(50));
    }
    
    @Test
    public void assertIsInvalidHeader() {
        assertFalse(new PostgreSQLPacketCodecEngine().isValidHeader(4));
    }
    
    @Test
    public void assertDecode() {
        when(byteBuf.markReaderIndex()).thenReturn(byteBuf);
        when(byteBuf.readableBytes()).thenReturn(51, 47, 0);
        when(byteBuf.readInt()).thenReturn(50);
        List<Object> out = new LinkedList<>();
        new PostgreSQLPacketCodecEngine().decode(context, byteBuf, out);
        assertThat(out.size(), is(1));
    }
    
    @Test
    public void assertDecodeWithStickyPacket() {
        List<Object> out = new LinkedList<>();
        new PostgreSQLPacketCodecEngine().decode(context, byteBuf, out);
        assertTrue(out.isEmpty());
    }
    
    @Test
    public void assertEncode() {
        ByteBufAllocator byteBufAllocator = mock(ByteBufAllocator.class);
        when(context.alloc()).thenReturn(byteBufAllocator);
        ByteBuf payloadByteBuf = mock(ByteBuf.class);
        when(byteBufAllocator.buffer()).thenReturn(payloadByteBuf);
        when(payloadByteBuf.readableBytes()).thenReturn(50);
        PostgreSQLIdentifierPacket actualMessage = mock(PostgreSQLIdentifierPacket.class);
        when(actualMessage.getIdentifier()).thenReturn(PostgreSQLMessagePacketType.AUTHENTICATION_REQUEST);
        new PostgreSQLPacketCodecEngine().encode(context, actualMessage, byteBuf);
        verify(actualMessage).write(ArgumentMatchers.any());
        verify(byteBuf).writeByte(PostgreSQLMessagePacketType.AUTHENTICATION_REQUEST.getValue());
        verify(byteBuf).writeInt(54);
        verify(byteBuf).writeBytes(payloadByteBuf);
    }
    
    @Test
    public void assertCreatePacketPayload() {
        assertThat(new PostgreSQLPacketCodecEngine().createPacketPayload(byteBuf).getByteBuf(), is(byteBuf));
    }
}
