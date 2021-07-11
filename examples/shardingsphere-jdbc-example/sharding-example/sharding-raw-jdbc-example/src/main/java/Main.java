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

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;

public final class Main {
    
    public static void main(final String[] args) throws ClassNotFoundException {
        String driverClassName = "com.mysql.cj.jdbc.Driver";
//        String url = "jdbc:mysql://localhost:3306/demo_read_ds_0?serverTimezone=UTC&useSSL=false&useUnicode=true&characterEncoding=UTF-8&useServerPrepStmts=true&cachePrepStmts=true";
//        String username = "root";
//        String password = "";
        String url = "jdbc:mysql://localhost:3307/readwrite_splitting_db?serverTimezone=UTC&useSSL=false&useUnicode=true&characterEncoding=UTF-8&useServerPrepStmts=true&cachePrepStmts=true";
        String username = "root";
        String password = "root";
        String sql = "SELECT * FROM t_order WHERE order_id=?";
        Class.forName(driverClassName);
        try (Connection connection = DriverManager.getConnection(url, username, password);
             PreparedStatement preparedStatement = connection.prepareStatement(sql)
        ) {
            for (int i = 0; i < 10; i++) {
                executeQuery(preparedStatement);
            }
        } catch (final SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    private static void executeQuery(final PreparedStatement preparedStatement) throws SQLException {
        preparedStatement.setLong(1, 1);
        long before = System.nanoTime();
        try (ResultSet resultSet = preparedStatement.executeQuery()) {
            while (resultSet.next()) {
                resultSet.getObject(1);
            }
        }
        long time = System.nanoTime() - before;
        System.out.println(new DecimalFormat("###,###,###,###,###").format(time));
    }
}
