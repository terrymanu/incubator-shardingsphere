// Generated from /Users/zhangliang/IdeaProjects/incubator-shardingsphere/shardingsphere-sql-parser/shardingsphere-sql-parser-dialect/shardingsphere-sql-parser-oracle/src/main/antlr4/imports/oracle/BaseRule.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BaseRuleParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, AND_=2, OR_=3, NOT_=4, TILDE_=5, VERTICAL_BAR_=6, AMPERSAND_=7, 
		SIGNED_LEFT_SHIFT_=8, SIGNED_RIGHT_SHIFT_=9, CARET_=10, MOD_=11, COLON_=12, 
		PLUS_=13, MINUS_=14, ASTERISK_=15, SLASH_=16, BACKSLASH_=17, DOT_=18, 
		DOT_ASTERISK_=19, SAFE_EQ_=20, DEQ_=21, EQ_=22, NEQ_=23, GT_=24, GTE_=25, 
		LT_=26, LTE_=27, POUND_=28, LP_=29, RP_=30, LBE_=31, RBE_=32, LBT_=33, 
		RBT_=34, COMMA_=35, DQ_=36, SQ_=37, BQ_=38, QUESTION_=39, AT_=40, SEMI_=41, 
		DOLLAR_=42, WS=43, SELECT=44, INSERT=45, UPDATE=46, DELETE=47, CREATE=48, 
		ALTER=49, DROP=50, TRUNCATE=51, SCHEMA=52, GRANT=53, REVOKE=54, ADD=55, 
		SET=56, TABLE=57, COLUMN=58, INDEX=59, CONSTRAINT=60, PRIMARY=61, UNIQUE=62, 
		FOREIGN=63, KEY=64, POSITION=65, PRECISION=66, FUNCTION=67, TRIGGER=68, 
		PROCEDURE=69, VIEW=70, INTO=71, VALUES=72, WITH=73, UNION=74, DISTINCT=75, 
		CASE=76, WHEN=77, CAST=78, TRIM=79, SUBSTRING=80, FROM=81, NATURAL=82, 
		JOIN=83, FULL=84, INNER=85, OUTER=86, LEFT=87, RIGHT=88, CROSS=89, USING=90, 
		WHERE=91, AS=92, ON=93, IF=94, ELSE=95, THEN=96, FOR=97, TO=98, AND=99, 
		OR=100, IS=101, NOT=102, NULL=103, TRUE=104, FALSE=105, EXISTS=106, BETWEEN=107, 
		IN=108, ALL=109, ANY=110, LIKE=111, ORDER=112, GROUP=113, BY=114, ASC=115, 
		DESC=116, HAVING=117, LIMIT=118, OFFSET=119, BEGIN=120, COMMIT=121, ROLLBACK=122, 
		SAVEPOINT=123, BOOLEAN=124, DOUBLE=125, CHAR=126, CHARACTER=127, ARRAY=128, 
		INTERVAL=129, DATE=130, TIME=131, TIMEOUT=132, TIMESTAMP=133, LOCALTIME=134, 
		LOCALTIMESTAMP=135, YEAR=136, QUARTER=137, MONTH=138, WEEK=139, DAY=140, 
		HOUR=141, MINUTE=142, SECOND=143, MICROSECOND=144, MAX=145, MIN=146, SUM=147, 
		COUNT=148, AVG=149, DEFAULT=150, CURRENT=151, ENABLE=152, DISABLE=153, 
		CALL=154, INSTANCE=155, PRESERVE=156, DO=157, DEFINER=158, CURRENT_USER=159, 
		SQL=160, CASCADED=161, LOCAL=162, CLOSE=163, OPEN=164, NEXT=165, NAME=166, 
		COLLATION=167, NAMES=168, INTEGER=169, REAL=170, DECIMAL=171, TYPE=172, 
		INT=173, SMALLINT=174, NUMERIC=175, FLOAT=176, TRIGGERS=177, GLOBAL_NAME=178, 
		FOR_GENERATOR=179, BINARY=180, ESCAPE=181, MOD=182, XOR=183, ROW=184, 
		ROWS=185, UNKNOWN=186, ALWAYS=187, CASCADE=188, CHECK=189, GENERATED=190, 
		PRIVILEGES=191, READ=192, WRITE=193, REFERENCES=194, START=195, TRANSACTION=196, 
		USER=197, ROLE=198, VISIBLE=199, INVISIBLE=200, EXECUTE=201, USE=202, 
		DEBUG=203, UNDER=204, FLASHBACK=205, ARCHIVE=206, REFRESH=207, QUERY=208, 
		REWRITE=209, KEEP=210, SEQUENCE=211, INHERIT=212, TRANSLATE=213, MERGE=214, 
		AT=215, BITMAP=216, CACHE=217, NOCACHE=218, CHECKPOINT=219, CONNECT=220, 
		CONSTRAINTS=221, CYCLE=222, NOCYCLE=223, DBTIMEZONE=224, ENCRYPT=225, 
		DECRYPT=226, DEFERRABLE=227, DEFERRED=228, DIRECTORY=229, EDITION=230, 
		ELEMENT=231, END=232, EXCEPT=233, EXCEPTIONS=234, FORCE=235, GLOBAL=236, 
		IDENTIFIED=237, IDENTITY=238, IMMEDIATE=239, INCREMENT=240, INITIALLY=241, 
		INVALIDATE=242, JAVA=243, LEVELS=244, MAXVALUE=245, MINVALUE=246, NOMAXVALUE=247, 
		NOMINVALUE=248, NOSORT=249, MINING=250, MODEL=251, MODIFY=252, NATIONAL=253, 
		NEW=254, NOORDER=255, NORELY=256, OF=257, ONLY=258, PRIOR=259, PROFILE=260, 
		REF=261, REKEY=262, RELY=263, RENAME=264, REPLACE=265, RESOURCE=266, REVERSE=267, 
		ROWID=268, SALT=269, SCOPE=270, SORT=271, SOURCE=272, SUBSTITUTABLE=273, 
		TABLESPACE=274, TEMPORARY=275, TRANSLATION=276, TREAT=277, NO=278, UNUSED=279, 
		VALIDATE=280, NOVALIDATE=281, VALUE=282, VARYING=283, VIRTUAL=284, ZONE=285, 
		PUBLIC=286, SESSION=287, COMMENT=288, LOCK=289, ADVISOR=290, ADMINISTER=291, 
		TUNING=292, MANAGE=293, MANAGEMENT=294, OBJECT=295, CLUSTER=296, CONTEXT=297, 
		EXEMPT=298, REDACTION=299, POLICY=300, DATABASE=301, SYSTEM=302, AUDIT=303, 
		LINK=304, ANALYZE=305, DICTIONARY=306, DIMENSION=307, INDEXTYPE=308, INDEXTYPES=309, 
		EXTERNAL=310, JOB=311, CLASS=312, PROGRAM=313, SCHEDULER=314, LIBRARY=315, 
		LOGMINING=316, MATERIALIZED=317, CUBE=318, MEASURE=319, FOLDER=320, BUILD=321, 
		PROCESS=322, OPERATOR=323, OUTLINE=324, PLUGGABLE=325, CONTAINER=326, 
		SEGMENT=327, RESTRICTED=328, COST=329, SYNONYM=330, BACKUP=331, UNLIMITED=332, 
		BECOME=333, CHANGE=334, NOTIFICATION=335, ACCESS=336, PRIVILEGE=337, PURGE=338, 
		RESUMABLE=339, SYSGUID=340, SYSBACKUP=341, SYSDBA=342, SYSDG=343, SYSKM=344, 
		SYSOPER=345, DBA_RECYCLEBIN=346, FIRST=347, NCHAR=348, RAW=349, VARCHAR=350, 
		VARCHAR2=351, NVARCHAR2=352, LONG=353, BLOB=354, CLOB=355, NCLOB=356, 
		BINARY_FLOAT=357, BINARY_DOUBLE=358, PLS_INTEGER=359, BINARY_INTEGER=360, 
		NUMBER=361, NATURALN=362, POSITIVE=363, POSITIVEN=364, SIGNTYPE=365, SIMPLE_INTEGER=366, 
		BFILE=367, MLSLABEL=368, UROWID=369, JSON=370, DEC=371, SHARING=372, PRIVATE=373, 
		SHARDED=374, SHARD=375, DUPLICATED=376, METADATA=377, DATA=378, EXTENDED=379, 
		NONE=380, MEMOPTIMIZE=381, PARENT=382, IDENTIFIER=383, WORK=384, CONTAINER_MAP=385, 
		CONTAINERS_DEFAULT=386, WAIT=387, NOWAIT=388, BATCH=389, BLOCK=390, REBUILD=391, 
		INVALIDATION=392, COMPILE=393, USABLE=394, UNUSABLE=395, ONLINE=396, MONITORING=397, 
		NOMONITORING=398, USAGE=399, COALESCE=400, CLEANUP=401, PARALLEL=402, 
		NOPARALLEL=403, LOG=404, REUSE=405, STORAGE=406, MATCHED=407, ERRORS=408, 
		REJECT=409, RETENTION=410, CHUNK=411, PCTVERSION=412, FREEPOOLS=413, AUTO=414, 
		DEDUPLICATE=415, KEEP_DUPLICATES=416, COMPRESS=417, HIGH=418, MEDIUM=419, 
		LOW=420, NOCOMPRESS=421, READS=422, CREATION=423, PCTFREE=424, PCTUSED=425, 
		INITRANS=426, LOGGING=427, NOLOGGING=428, FILESYSTEM_LIKE_LOGGING=429, 
		INITIAL=430, MINEXTENTS=431, MAXEXTENTS=432, BASIC=433, ADVANCED=434, 
		PCTINCREASE=435, FREELISTS=436, DML=437, DDL=438, CAPACITY=439, FREELIST=440, 
		GROUPS=441, OPTIMAL=442, BUFFER_POOL=443, RECYCLE=444, FLASH_CACHE=445, 
		CELL_FLASH_CACHE=446, MAXSIZE=447, STORE=448, LEVEL=449, LOCKING=450, 
		INMEMORY=451, MEMCOMPRESS=452, PRIORITY=453, CRITICAL=454, DISTRIBUTE=455, 
		RANGE=456, PARTITION=457, SUBPARTITION=458, SERVICE=459, DUPLICATE=460, 
		ILM=461, DELETE_ALL=462, ENABLE_ALL=463, DISABLE_ALL=464, AFTER=465, MODIFICATION=466, 
		DAYS=467, MONTHS=468, YEARS=469, TIER=470, ORGANIZATION=471, HEAP=472, 
		PCTTHRESHOLD=473, PARAMETERS=474, LOCATION=475, MAPPING=476, NOMAPPING=477, 
		INCLUDING=478, OVERFLOW=479, ATTRIBUTES=480, RESULT_CACHE=481, ROWDEPENDENCIES=482, 
		NOROWDEPENDENCIES=483, ARCHIVAL=484, EXCHANGE=485, INDEXING=486, OFF=487, 
		LESS=488, INTERNAL=489, VARRAY=490, NESTED=491, COLUMN_VALUE=492, RETURN=493, 
		LOCATOR=494, MODE=495, LOB=496, SECUREFILE=497, BASICFILE=498, THAN=499, 
		LIST=500, AUTOMATIC=501, HASH=502, PARTITIONS=503, SUBPARTITIONS=504, 
		TEMPLATE=505, PARTITIONSET=506, REFERENCE=507, CONSISTENT=508, CLUSTERING=509, 
		LINEAR=510, INTERLEAVED=511, YES=512, LOAD=513, MOVEMENT=514, ZONEMAP=515, 
		WITHOUT=516, XMLTYPE=517, RELATIONAL=518, XML=519, VARRAYS=520, LOBS=521, 
		TABLES=522, ALLOW=523, DISALLOW=524, NONSCHEMA=525, ANYSCHEMA=526, XMLSCHEMA=527, 
		COLUMNS=528, OIDINDEX=529, EDITIONABLE=530, NONEDITIONABLE=531, DEPENDENT=532, 
		INDEXES=533, SHRINK=534, SPACE=535, COMPACT=536, SUPPLEMENTAL=537, ADVISE=538, 
		NOTHING=539, GUARD=540, SYNC=541, VISIBILITY=542, ACTIVE=543, DEFAULT_COLLATION=544, 
		MOUNT=545, STANDBY=546, CLONE=547, RESETLOGS=548, NORESETLOGS=549, UPGRADE=550, 
		DOWNGRADE=551, RECOVER=552, LOGFILE=553, TEST=554, CORRUPTION=555, CONTINUE=556, 
		CANCEL=557, UNTIL=558, CONTROLFILE=559, SNAPSHOT=560, DATAFILE=561, MANAGED=562, 
		ARCHIVED=563, DISCONNECT=564, NODELAY=565, INSTANCES=566, FINISH=567, 
		LOGICAL=568, FILE=569, SIZE=570, AUTOEXTEND=571, BLOCKSIZE=572, OFFLINE=573, 
		RESIZE=574, TEMPFILE=575, DATAFILES=576, ARCHIVELOG=577, MANUAL=578, NOARCHIVELOG=579, 
		AVAILABILITY=580, PERFORMANCE=581, CLEAR=582, UNARCHIVED=583, UNRECOVERABLE=584, 
		THREAD=585, MEMBER=586, PHYSICAL=587, FAR=588, TRACE=589, DISTRIBUTED=590, 
		RECOVERY=591, FLUSH=592, NOREPLY=593, SWITCH=594, LOGFILES=595, PROCEDURAL=596, 
		REPLICATION=597, SUBSET=598, ACTIVATE=599, APPLY=600, MAXIMIZE=601, PROTECTION=602, 
		SUSPEND=603, RESUME=604, QUIESCE=605, UNQUIESCE=606, SHUTDOWN=607, REGISTER=608, 
		PREPARE=609, SWITCHOVER=610, FAILED=611, SKIP_SYMBOL=612, STOP=613, ABORT=614, 
		VERIFY=615, CONVERT=616, FAILOVER=617, BIGFILE=618, SMALLFILE=619, TRACKING=620, 
		CACHING=621, CONTAINERS=622, TARGET=623, UNDO=624, MOVE=625, MIRROR=626, 
		COPY=627, UNPROTECTED=628, REDUNDANCY=629, REMOVE=630, LOST=631, LEAD_CDB=632, 
		LEAD_CDB_URI=633, PROPERTY=634, DEFAULT_CREDENTIAL=635, TIME_ZONE=636, 
		RESET=637, RELOCATE=638, CLIENT=639, PASSWORDFILE_METADATA_CACHE=640, 
		NOSWITCH=641, POST_TRANSACTION=642, KILL=643, ROLLING=644, MIGRATION=645, 
		PATCH=646, ENCRYPTION=647, WALLET=648, AFFINITY=649, MEMORY=650, SPFILE=651, 
		BOTH=652, SID=653, SHARED_POOL=654, BUFFER_CACHE=655, REDO=656, CONFIRM=657, 
		MIGRATE=658, USE_STORED_OUTLINES=659, GLOBAL_TOPIC_ENABLED=660, INTERSECT=661, 
		MINUS=662, LOCKED=663, FETCH=664, PERCENT=665, TIES=666, SIBLINGS=667, 
		NULLS=668, LAST=669, ISOLATION=670, SERIALIZABLE=671, COMMITTED=672, FILTER=673, 
		FACT=674, DETERMINISTIC=675, PIPELINED=676, PARALLEL_ENABLE=677, OUT=678, 
		NOCOPY=679, ACCESSIBLE=680, PACKAGE=681, PACKAGES=682, USING_NLS_COMP=683, 
		AUTHID=684, SEARCH=685, DEPTH=686, BREADTH=687, ANALYTIC=688, HIERARCHIES=689, 
		MEASURES=690, OVER=691, LAG=692, LAG_DIFF=693, LAG_DIF_PERCENT=694, LEAD=695, 
		LEAD_DIFF=696, LEAD_DIFF_PERCENT=697, HIERARCHY=698, WITHIN=699, ACROSS=700, 
		ANCESTOR=701, BEGINNING=702, UNBOUNDED=703, PRECEDING=704, FOLLOWING=705, 
		RANK=706, DENSE_RANK=707, AVERAGE_RANK=708, ROW_NUMBER=709, SHARE_OF=710, 
		HIER_ANCESTOR=711, HIER_PARENT=712, HIER_LEAD=713, HIER_LAG=714, QUALIFY=715, 
		HIER_CAPTION=716, HIER_DEPTH=717, HIER_DESCRIPTION=718, HIER_LEVEL=719, 
		HIER_MEMBER_NAME=720, HIER_MEMBER_UNIQUE_NAME=721, CHAINED=722, STATISTICS=723, 
		DANGLING=724, STRUCTURE=725, FAST=726, COMPLETE=727, ASSOCIATE=728, DISASSOCIATE=729, 
		FUNCTIONS=730, TYPES=731, SELECTIVITY=732, RETURNING=733, VERSIONS=734, 
		SCN=735, PERIOD=736, LATERAL=737, BADFILE=738, DISCARDFILE=739, PIVOT=740, 
		UNPIVOT=741, INCLUDE=742, EXCLUDE=743, SAMPLE=744, SEED=745, OPTION=746, 
		SHARDS=747, MATCH_RECOGNIZE=748, PATTERN=749, DEFINE=750, ONE=751, PER=752, 
		MATCH=753, PAST=754, PERMUTE=755, CLASSIFIER=756, MATCH_NUMBER=757, RUNNING=758, 
		FINAL=759, PREV=760, NOAUDIT=761, WHENEVER=762, SUCCESSFUL=763, USERS=764, 
		GRANTED=765, ROLES=766, NAMESPACE=767, IDENTIFIER_=768, STRING_=769, INTEGER_=770, 
		NUMBER_=771, HEX_DIGIT_=772, BIT_NUM_=773;
	public static final int
		RULE_parameterMarker = 0, RULE_literals = 1, RULE_stringLiterals = 2, 
		RULE_numberLiterals = 3, RULE_dateTimeLiterals = 4, RULE_hexadecimalLiterals = 5, 
		RULE_bitValueLiterals = 6, RULE_booleanLiterals = 7, RULE_nullValueLiterals = 8, 
		RULE_identifier = 9, RULE_unreservedWord = 10, RULE_schemaName = 11, RULE_tableName = 12, 
		RULE_viewName = 13, RULE_materializedViewName = 14, RULE_columnName = 15, 
		RULE_objectName = 16, RULE_clusterName = 17, RULE_indexName = 18, RULE_statisticsTypeName = 19, 
		RULE_function = 20, RULE_packageName = 21, RULE_typeName = 22, RULE_indexTypeName = 23, 
		RULE_constraintName = 24, RULE_savepointName = 25, RULE_synonymName = 26, 
		RULE_owner = 27, RULE_name = 28, RULE_tablespaceName = 29, RULE_tablespaceSetName = 30, 
		RULE_serviceName = 31, RULE_ilmPolicyName = 32, RULE_policyName = 33, 
		RULE_functionName = 34, RULE_dbLink = 35, RULE_parameterValue = 36, RULE_directoryName = 37, 
		RULE_dispatcherName = 38, RULE_clientId = 39, RULE_opaqueFormatSpec = 40, 
		RULE_accessDriverType = 41, RULE_varrayItem = 42, RULE_nestedItem = 43, 
		RULE_storageTable = 44, RULE_lobSegname = 45, RULE_locationSpecifier = 46, 
		RULE_xmlSchemaURLName = 47, RULE_elementName = 48, RULE_subpartitionName = 49, 
		RULE_parameterName = 50, RULE_editionName = 51, RULE_containerName = 52, 
		RULE_partitionName = 53, RULE_partitionSetName = 54, RULE_partitionKeyValue = 55, 
		RULE_subpartitionKeyValue = 56, RULE_zonemapName = 57, RULE_flashbackArchiveName = 58, 
		RULE_roleName = 59, RULE_userName = 60, RULE_password = 61, RULE_logGroupName = 62, 
		RULE_columnNames = 63, RULE_tableNames = 64, RULE_oracleId = 65, RULE_collationName = 66, 
		RULE_columnCollationName = 67, RULE_alias = 68, RULE_dataTypeLength = 69, 
		RULE_primaryKey = 70, RULE_exprs = 71, RULE_exprList = 72, RULE_expr = 73, 
		RULE_logicalOperator = 74, RULE_notOperator = 75, RULE_booleanPrimary = 76, 
		RULE_comparisonOperator = 77, RULE_predicate = 78, RULE_bitExpr = 79, 
		RULE_simpleExpr = 80, RULE_functionCall = 81, RULE_aggregationFunction = 82, 
		RULE_aggregationFunctionName = 83, RULE_distinct = 84, RULE_specialFunction = 85, 
		RULE_castFunction = 86, RULE_charFunction = 87, RULE_regularFunction = 88, 
		RULE_regularFunctionName = 89, RULE_caseExpression = 90, RULE_caseWhen = 91, 
		RULE_caseElse = 92, RULE_subquery = 93, RULE_orderByClause = 94, RULE_orderByItem = 95, 
		RULE_attributeName = 96, RULE_simpleExprs = 97, RULE_lobItem = 98, RULE_lobItems = 99, 
		RULE_lobItemList = 100, RULE_dataType = 101, RULE_specialDatatype = 102, 
		RULE_dataTypeName = 103, RULE_datetimeTypeSuffix = 104, RULE_treatFunction = 105, 
		RULE_privateExprOfDb = 106, RULE_caseExpr = 107, RULE_simpleCaseExpr = 108, 
		RULE_searchedCaseExpr = 109, RULE_elseClause = 110, RULE_intervalExpression = 111, 
		RULE_objectAccessExpression = 112, RULE_constructorExpr = 113, RULE_ignoredIdentifier = 114, 
		RULE_ignoredIdentifiers = 115, RULE_matchNone = 116, RULE_hashSubpartitionQuantity = 117, 
		RULE_odciParameters = 118, RULE_databaseName = 119, RULE_locationName = 120, 
		RULE_fileName = 121, RULE_asmFileName = 122, RULE_fileNumber = 123, RULE_instanceName = 124, 
		RULE_logminerSessionName = 125, RULE_tablespaceGroupName = 126, RULE_copyName = 127, 
		RULE_mirrorName = 128, RULE_uriString = 129, RULE_qualifiedCredentialName = 130, 
		RULE_pdbName = 131, RULE_diskgroupName = 132, RULE_templateName = 133, 
		RULE_aliasName = 134, RULE_domain = 135, RULE_dateValue = 136, RULE_sessionId = 137, 
		RULE_serialNumber = 138, RULE_instanceId = 139, RULE_sqlId = 140, RULE_logFileName = 141, 
		RULE_logFileGroupsArchivedLocationName = 142, RULE_asmVersion = 143, RULE_walletPassword = 144, 
		RULE_hsmAuthString = 145, RULE_targetDbName = 146, RULE_certificateId = 147, 
		RULE_categoryName = 148, RULE_offset = 149, RULE_rowcount = 150, RULE_percent = 151, 
		RULE_rollbackSegment = 152, RULE_queryName = 153, RULE_cycleValue = 154, 
		RULE_noCycleValue = 155, RULE_orderingColumn = 156, RULE_subavName = 157, 
		RULE_baseAvName = 158, RULE_measName = 159, RULE_levelRef = 160, RULE_offsetExpr = 161, 
		RULE_memberKeyExpr = 162, RULE_depthExpression = 163, RULE_unitName = 164, 
		RULE_procedureName = 165, RULE_cpuCost = 166, RULE_ioCost = 167, RULE_networkCost = 168, 
		RULE_defaultSelectivity = 169, RULE_dataItem = 170, RULE_variableName = 171, 
		RULE_validTimeColumn = 172, RULE_attrDim = 173, RULE_hierarchyName = 174, 
		RULE_analyticViewName = 175, RULE_samplePercent = 176, RULE_seedValue = 177, 
		RULE_namespace = 178;
	private static String[] makeRuleNames() {
		return new String[] {
			"parameterMarker", "literals", "stringLiterals", "numberLiterals", "dateTimeLiterals", 
			"hexadecimalLiterals", "bitValueLiterals", "booleanLiterals", "nullValueLiterals", 
			"identifier", "unreservedWord", "schemaName", "tableName", "viewName", 
			"materializedViewName", "columnName", "objectName", "clusterName", "indexName", 
			"statisticsTypeName", "function", "packageName", "typeName", "indexTypeName", 
			"constraintName", "savepointName", "synonymName", "owner", "name", "tablespaceName", 
			"tablespaceSetName", "serviceName", "ilmPolicyName", "policyName", "functionName", 
			"dbLink", "parameterValue", "directoryName", "dispatcherName", "clientId", 
			"opaqueFormatSpec", "accessDriverType", "varrayItem", "nestedItem", "storageTable", 
			"lobSegname", "locationSpecifier", "xmlSchemaURLName", "elementName", 
			"subpartitionName", "parameterName", "editionName", "containerName", 
			"partitionName", "partitionSetName", "partitionKeyValue", "subpartitionKeyValue", 
			"zonemapName", "flashbackArchiveName", "roleName", "userName", "password", 
			"logGroupName", "columnNames", "tableNames", "oracleId", "collationName", 
			"columnCollationName", "alias", "dataTypeLength", "primaryKey", "exprs", 
			"exprList", "expr", "logicalOperator", "notOperator", "booleanPrimary", 
			"comparisonOperator", "predicate", "bitExpr", "simpleExpr", "functionCall", 
			"aggregationFunction", "aggregationFunctionName", "distinct", "specialFunction", 
			"castFunction", "charFunction", "regularFunction", "regularFunctionName", 
			"caseExpression", "caseWhen", "caseElse", "subquery", "orderByClause", 
			"orderByItem", "attributeName", "simpleExprs", "lobItem", "lobItems", 
			"lobItemList", "dataType", "specialDatatype", "dataTypeName", "datetimeTypeSuffix", 
			"treatFunction", "privateExprOfDb", "caseExpr", "simpleCaseExpr", "searchedCaseExpr", 
			"elseClause", "intervalExpression", "objectAccessExpression", "constructorExpr", 
			"ignoredIdentifier", "ignoredIdentifiers", "matchNone", "hashSubpartitionQuantity", 
			"odciParameters", "databaseName", "locationName", "fileName", "asmFileName", 
			"fileNumber", "instanceName", "logminerSessionName", "tablespaceGroupName", 
			"copyName", "mirrorName", "uriString", "qualifiedCredentialName", "pdbName", 
			"diskgroupName", "templateName", "aliasName", "domain", "dateValue", 
			"sessionId", "serialNumber", "instanceId", "sqlId", "logFileName", "logFileGroupsArchivedLocationName", 
			"asmVersion", "walletPassword", "hsmAuthString", "targetDbName", "certificateId", 
			"categoryName", "offset", "rowcount", "percent", "rollbackSegment", "queryName", 
			"cycleValue", "noCycleValue", "orderingColumn", "subavName", "baseAvName", 
			"measName", "levelRef", "offsetExpr", "memberKeyExpr", "depthExpression", 
			"unitName", "procedureName", "cpuCost", "ioCost", "networkCost", "defaultSelectivity", 
			"dataItem", "variableName", "validTimeColumn", "attrDim", "hierarchyName", 
			"analyticViewName", "samplePercent", "seedValue", "namespace"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Default does not match anything'", "'&&'", "'||'", "'!'", "'~'", 
			"'|'", "'&'", "'<<'", "'>>'", "'^'", "'%'", "':'", "'+'", "'-'", "'*'", 
			"'/'", "'\\'", "'.'", "'.*'", "'<=>'", "'=='", "'='", null, "'>'", "'>='", 
			"'<'", "'<='", "'#'", "'('", "')'", "'{'", "'}'", "'['", "']'", "','", 
			"'\"'", "'''", "'`'", "'?'", "'@'", "';'", "'$'", null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"'DO NOT MATCH ANY THING, JUST FOR GENERATOR'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "AND_", "OR_", "NOT_", "TILDE_", "VERTICAL_BAR_", "AMPERSAND_", 
			"SIGNED_LEFT_SHIFT_", "SIGNED_RIGHT_SHIFT_", "CARET_", "MOD_", "COLON_", 
			"PLUS_", "MINUS_", "ASTERISK_", "SLASH_", "BACKSLASH_", "DOT_", "DOT_ASTERISK_", 
			"SAFE_EQ_", "DEQ_", "EQ_", "NEQ_", "GT_", "GTE_", "LT_", "LTE_", "POUND_", 
			"LP_", "RP_", "LBE_", "RBE_", "LBT_", "RBT_", "COMMA_", "DQ_", "SQ_", 
			"BQ_", "QUESTION_", "AT_", "SEMI_", "DOLLAR_", "WS", "SELECT", "INSERT", 
			"UPDATE", "DELETE", "CREATE", "ALTER", "DROP", "TRUNCATE", "SCHEMA", 
			"GRANT", "REVOKE", "ADD", "SET", "TABLE", "COLUMN", "INDEX", "CONSTRAINT", 
			"PRIMARY", "UNIQUE", "FOREIGN", "KEY", "POSITION", "PRECISION", "FUNCTION", 
			"TRIGGER", "PROCEDURE", "VIEW", "INTO", "VALUES", "WITH", "UNION", "DISTINCT", 
			"CASE", "WHEN", "CAST", "TRIM", "SUBSTRING", "FROM", "NATURAL", "JOIN", 
			"FULL", "INNER", "OUTER", "LEFT", "RIGHT", "CROSS", "USING", "WHERE", 
			"AS", "ON", "IF", "ELSE", "THEN", "FOR", "TO", "AND", "OR", "IS", "NOT", 
			"NULL", "TRUE", "FALSE", "EXISTS", "BETWEEN", "IN", "ALL", "ANY", "LIKE", 
			"ORDER", "GROUP", "BY", "ASC", "DESC", "HAVING", "LIMIT", "OFFSET", "BEGIN", 
			"COMMIT", "ROLLBACK", "SAVEPOINT", "BOOLEAN", "DOUBLE", "CHAR", "CHARACTER", 
			"ARRAY", "INTERVAL", "DATE", "TIME", "TIMEOUT", "TIMESTAMP", "LOCALTIME", 
			"LOCALTIMESTAMP", "YEAR", "QUARTER", "MONTH", "WEEK", "DAY", "HOUR", 
			"MINUTE", "SECOND", "MICROSECOND", "MAX", "MIN", "SUM", "COUNT", "AVG", 
			"DEFAULT", "CURRENT", "ENABLE", "DISABLE", "CALL", "INSTANCE", "PRESERVE", 
			"DO", "DEFINER", "CURRENT_USER", "SQL", "CASCADED", "LOCAL", "CLOSE", 
			"OPEN", "NEXT", "NAME", "COLLATION", "NAMES", "INTEGER", "REAL", "DECIMAL", 
			"TYPE", "INT", "SMALLINT", "NUMERIC", "FLOAT", "TRIGGERS", "GLOBAL_NAME", 
			"FOR_GENERATOR", "BINARY", "ESCAPE", "MOD", "XOR", "ROW", "ROWS", "UNKNOWN", 
			"ALWAYS", "CASCADE", "CHECK", "GENERATED", "PRIVILEGES", "READ", "WRITE", 
			"REFERENCES", "START", "TRANSACTION", "USER", "ROLE", "VISIBLE", "INVISIBLE", 
			"EXECUTE", "USE", "DEBUG", "UNDER", "FLASHBACK", "ARCHIVE", "REFRESH", 
			"QUERY", "REWRITE", "KEEP", "SEQUENCE", "INHERIT", "TRANSLATE", "MERGE", 
			"AT", "BITMAP", "CACHE", "NOCACHE", "CHECKPOINT", "CONNECT", "CONSTRAINTS", 
			"CYCLE", "NOCYCLE", "DBTIMEZONE", "ENCRYPT", "DECRYPT", "DEFERRABLE", 
			"DEFERRED", "DIRECTORY", "EDITION", "ELEMENT", "END", "EXCEPT", "EXCEPTIONS", 
			"FORCE", "GLOBAL", "IDENTIFIED", "IDENTITY", "IMMEDIATE", "INCREMENT", 
			"INITIALLY", "INVALIDATE", "JAVA", "LEVELS", "MAXVALUE", "MINVALUE", 
			"NOMAXVALUE", "NOMINVALUE", "NOSORT", "MINING", "MODEL", "MODIFY", "NATIONAL", 
			"NEW", "NOORDER", "NORELY", "OF", "ONLY", "PRIOR", "PROFILE", "REF", 
			"REKEY", "RELY", "RENAME", "REPLACE", "RESOURCE", "REVERSE", "ROWID", 
			"SALT", "SCOPE", "SORT", "SOURCE", "SUBSTITUTABLE", "TABLESPACE", "TEMPORARY", 
			"TRANSLATION", "TREAT", "NO", "UNUSED", "VALIDATE", "NOVALIDATE", "VALUE", 
			"VARYING", "VIRTUAL", "ZONE", "PUBLIC", "SESSION", "COMMENT", "LOCK", 
			"ADVISOR", "ADMINISTER", "TUNING", "MANAGE", "MANAGEMENT", "OBJECT", 
			"CLUSTER", "CONTEXT", "EXEMPT", "REDACTION", "POLICY", "DATABASE", "SYSTEM", 
			"AUDIT", "LINK", "ANALYZE", "DICTIONARY", "DIMENSION", "INDEXTYPE", "INDEXTYPES", 
			"EXTERNAL", "JOB", "CLASS", "PROGRAM", "SCHEDULER", "LIBRARY", "LOGMINING", 
			"MATERIALIZED", "CUBE", "MEASURE", "FOLDER", "BUILD", "PROCESS", "OPERATOR", 
			"OUTLINE", "PLUGGABLE", "CONTAINER", "SEGMENT", "RESTRICTED", "COST", 
			"SYNONYM", "BACKUP", "UNLIMITED", "BECOME", "CHANGE", "NOTIFICATION", 
			"ACCESS", "PRIVILEGE", "PURGE", "RESUMABLE", "SYSGUID", "SYSBACKUP", 
			"SYSDBA", "SYSDG", "SYSKM", "SYSOPER", "DBA_RECYCLEBIN", "FIRST", "NCHAR", 
			"RAW", "VARCHAR", "VARCHAR2", "NVARCHAR2", "LONG", "BLOB", "CLOB", "NCLOB", 
			"BINARY_FLOAT", "BINARY_DOUBLE", "PLS_INTEGER", "BINARY_INTEGER", "NUMBER", 
			"NATURALN", "POSITIVE", "POSITIVEN", "SIGNTYPE", "SIMPLE_INTEGER", "BFILE", 
			"MLSLABEL", "UROWID", "JSON", "DEC", "SHARING", "PRIVATE", "SHARDED", 
			"SHARD", "DUPLICATED", "METADATA", "DATA", "EXTENDED", "NONE", "MEMOPTIMIZE", 
			"PARENT", "IDENTIFIER", "WORK", "CONTAINER_MAP", "CONTAINERS_DEFAULT", 
			"WAIT", "NOWAIT", "BATCH", "BLOCK", "REBUILD", "INVALIDATION", "COMPILE", 
			"USABLE", "UNUSABLE", "ONLINE", "MONITORING", "NOMONITORING", "USAGE", 
			"COALESCE", "CLEANUP", "PARALLEL", "NOPARALLEL", "LOG", "REUSE", "STORAGE", 
			"MATCHED", "ERRORS", "REJECT", "RETENTION", "CHUNK", "PCTVERSION", "FREEPOOLS", 
			"AUTO", "DEDUPLICATE", "KEEP_DUPLICATES", "COMPRESS", "HIGH", "MEDIUM", 
			"LOW", "NOCOMPRESS", "READS", "CREATION", "PCTFREE", "PCTUSED", "INITRANS", 
			"LOGGING", "NOLOGGING", "FILESYSTEM_LIKE_LOGGING", "INITIAL", "MINEXTENTS", 
			"MAXEXTENTS", "BASIC", "ADVANCED", "PCTINCREASE", "FREELISTS", "DML", 
			"DDL", "CAPACITY", "FREELIST", "GROUPS", "OPTIMAL", "BUFFER_POOL", "RECYCLE", 
			"FLASH_CACHE", "CELL_FLASH_CACHE", "MAXSIZE", "STORE", "LEVEL", "LOCKING", 
			"INMEMORY", "MEMCOMPRESS", "PRIORITY", "CRITICAL", "DISTRIBUTE", "RANGE", 
			"PARTITION", "SUBPARTITION", "SERVICE", "DUPLICATE", "ILM", "DELETE_ALL", 
			"ENABLE_ALL", "DISABLE_ALL", "AFTER", "MODIFICATION", "DAYS", "MONTHS", 
			"YEARS", "TIER", "ORGANIZATION", "HEAP", "PCTTHRESHOLD", "PARAMETERS", 
			"LOCATION", "MAPPING", "NOMAPPING", "INCLUDING", "OVERFLOW", "ATTRIBUTES", 
			"RESULT_CACHE", "ROWDEPENDENCIES", "NOROWDEPENDENCIES", "ARCHIVAL", "EXCHANGE", 
			"INDEXING", "OFF", "LESS", "INTERNAL", "VARRAY", "NESTED", "COLUMN_VALUE", 
			"RETURN", "LOCATOR", "MODE", "LOB", "SECUREFILE", "BASICFILE", "THAN", 
			"LIST", "AUTOMATIC", "HASH", "PARTITIONS", "SUBPARTITIONS", "TEMPLATE", 
			"PARTITIONSET", "REFERENCE", "CONSISTENT", "CLUSTERING", "LINEAR", "INTERLEAVED", 
			"YES", "LOAD", "MOVEMENT", "ZONEMAP", "WITHOUT", "XMLTYPE", "RELATIONAL", 
			"XML", "VARRAYS", "LOBS", "TABLES", "ALLOW", "DISALLOW", "NONSCHEMA", 
			"ANYSCHEMA", "XMLSCHEMA", "COLUMNS", "OIDINDEX", "EDITIONABLE", "NONEDITIONABLE", 
			"DEPENDENT", "INDEXES", "SHRINK", "SPACE", "COMPACT", "SUPPLEMENTAL", 
			"ADVISE", "NOTHING", "GUARD", "SYNC", "VISIBILITY", "ACTIVE", "DEFAULT_COLLATION", 
			"MOUNT", "STANDBY", "CLONE", "RESETLOGS", "NORESETLOGS", "UPGRADE", "DOWNGRADE", 
			"RECOVER", "LOGFILE", "TEST", "CORRUPTION", "CONTINUE", "CANCEL", "UNTIL", 
			"CONTROLFILE", "SNAPSHOT", "DATAFILE", "MANAGED", "ARCHIVED", "DISCONNECT", 
			"NODELAY", "INSTANCES", "FINISH", "LOGICAL", "FILE", "SIZE", "AUTOEXTEND", 
			"BLOCKSIZE", "OFFLINE", "RESIZE", "TEMPFILE", "DATAFILES", "ARCHIVELOG", 
			"MANUAL", "NOARCHIVELOG", "AVAILABILITY", "PERFORMANCE", "CLEAR", "UNARCHIVED", 
			"UNRECOVERABLE", "THREAD", "MEMBER", "PHYSICAL", "FAR", "TRACE", "DISTRIBUTED", 
			"RECOVERY", "FLUSH", "NOREPLY", "SWITCH", "LOGFILES", "PROCEDURAL", "REPLICATION", 
			"SUBSET", "ACTIVATE", "APPLY", "MAXIMIZE", "PROTECTION", "SUSPEND", "RESUME", 
			"QUIESCE", "UNQUIESCE", "SHUTDOWN", "REGISTER", "PREPARE", "SWITCHOVER", 
			"FAILED", "SKIP_SYMBOL", "STOP", "ABORT", "VERIFY", "CONVERT", "FAILOVER", 
			"BIGFILE", "SMALLFILE", "TRACKING", "CACHING", "CONTAINERS", "TARGET", 
			"UNDO", "MOVE", "MIRROR", "COPY", "UNPROTECTED", "REDUNDANCY", "REMOVE", 
			"LOST", "LEAD_CDB", "LEAD_CDB_URI", "PROPERTY", "DEFAULT_CREDENTIAL", 
			"TIME_ZONE", "RESET", "RELOCATE", "CLIENT", "PASSWORDFILE_METADATA_CACHE", 
			"NOSWITCH", "POST_TRANSACTION", "KILL", "ROLLING", "MIGRATION", "PATCH", 
			"ENCRYPTION", "WALLET", "AFFINITY", "MEMORY", "SPFILE", "BOTH", "SID", 
			"SHARED_POOL", "BUFFER_CACHE", "REDO", "CONFIRM", "MIGRATE", "USE_STORED_OUTLINES", 
			"GLOBAL_TOPIC_ENABLED", "INTERSECT", "MINUS", "LOCKED", "FETCH", "PERCENT", 
			"TIES", "SIBLINGS", "NULLS", "LAST", "ISOLATION", "SERIALIZABLE", "COMMITTED", 
			"FILTER", "FACT", "DETERMINISTIC", "PIPELINED", "PARALLEL_ENABLE", "OUT", 
			"NOCOPY", "ACCESSIBLE", "PACKAGE", "PACKAGES", "USING_NLS_COMP", "AUTHID", 
			"SEARCH", "DEPTH", "BREADTH", "ANALYTIC", "HIERARCHIES", "MEASURES", 
			"OVER", "LAG", "LAG_DIFF", "LAG_DIF_PERCENT", "LEAD", "LEAD_DIFF", "LEAD_DIFF_PERCENT", 
			"HIERARCHY", "WITHIN", "ACROSS", "ANCESTOR", "BEGINNING", "UNBOUNDED", 
			"PRECEDING", "FOLLOWING", "RANK", "DENSE_RANK", "AVERAGE_RANK", "ROW_NUMBER", 
			"SHARE_OF", "HIER_ANCESTOR", "HIER_PARENT", "HIER_LEAD", "HIER_LAG", 
			"QUALIFY", "HIER_CAPTION", "HIER_DEPTH", "HIER_DESCRIPTION", "HIER_LEVEL", 
			"HIER_MEMBER_NAME", "HIER_MEMBER_UNIQUE_NAME", "CHAINED", "STATISTICS", 
			"DANGLING", "STRUCTURE", "FAST", "COMPLETE", "ASSOCIATE", "DISASSOCIATE", 
			"FUNCTIONS", "TYPES", "SELECTIVITY", "RETURNING", "VERSIONS", "SCN", 
			"PERIOD", "LATERAL", "BADFILE", "DISCARDFILE", "PIVOT", "UNPIVOT", "INCLUDE", 
			"EXCLUDE", "SAMPLE", "SEED", "OPTION", "SHARDS", "MATCH_RECOGNIZE", "PATTERN", 
			"DEFINE", "ONE", "PER", "MATCH", "PAST", "PERMUTE", "CLASSIFIER", "MATCH_NUMBER", 
			"RUNNING", "FINAL", "PREV", "NOAUDIT", "WHENEVER", "SUCCESSFUL", "USERS", 
			"GRANTED", "ROLES", "NAMESPACE", "IDENTIFIER_", "STRING_", "INTEGER_", 
			"NUMBER_", "HEX_DIGIT_", "BIT_NUM_"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "BaseRule.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BaseRuleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ParameterMarkerContext extends ParserRuleContext {
		public TerminalNode QUESTION_() { return getToken(BaseRuleParser.QUESTION_, 0); }
		public ParameterMarkerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterMarker; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterParameterMarker(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitParameterMarker(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitParameterMarker(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterMarkerContext parameterMarker() throws RecognitionException {
		ParameterMarkerContext _localctx = new ParameterMarkerContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parameterMarker);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(QUESTION_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralsContext extends ParserRuleContext {
		public StringLiteralsContext stringLiterals() {
			return getRuleContext(StringLiteralsContext.class,0);
		}
		public NumberLiteralsContext numberLiterals() {
			return getRuleContext(NumberLiteralsContext.class,0);
		}
		public DateTimeLiteralsContext dateTimeLiterals() {
			return getRuleContext(DateTimeLiteralsContext.class,0);
		}
		public HexadecimalLiteralsContext hexadecimalLiterals() {
			return getRuleContext(HexadecimalLiteralsContext.class,0);
		}
		public BitValueLiteralsContext bitValueLiterals() {
			return getRuleContext(BitValueLiteralsContext.class,0);
		}
		public BooleanLiteralsContext booleanLiterals() {
			return getRuleContext(BooleanLiteralsContext.class,0);
		}
		public NullValueLiteralsContext nullValueLiterals() {
			return getRuleContext(NullValueLiteralsContext.class,0);
		}
		public LiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterLiterals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitLiterals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralsContext literals() throws RecognitionException {
		LiteralsContext _localctx = new LiteralsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_literals);
		try {
			setState(367);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_:
				enterOuterAlt(_localctx, 1);
				{
				setState(360);
				stringLiterals();
				}
				break;
			case PLUS_:
			case MINUS_:
			case INTEGER_:
			case NUMBER_:
				enterOuterAlt(_localctx, 2);
				{
				setState(361);
				numberLiterals();
				}
				break;
			case LBE_:
			case DATE:
			case TIME:
			case TIMESTAMP:
				enterOuterAlt(_localctx, 3);
				{
				setState(362);
				dateTimeLiterals();
				}
				break;
			case HEX_DIGIT_:
				enterOuterAlt(_localctx, 4);
				{
				setState(363);
				hexadecimalLiterals();
				}
				break;
			case BIT_NUM_:
				enterOuterAlt(_localctx, 5);
				{
				setState(364);
				bitValueLiterals();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 6);
				{
				setState(365);
				booleanLiterals();
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 7);
				{
				setState(366);
				nullValueLiterals();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringLiteralsContext extends ParserRuleContext {
		public TerminalNode STRING_() { return getToken(BaseRuleParser.STRING_, 0); }
		public StringLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiterals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterStringLiterals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitStringLiterals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitStringLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralsContext stringLiterals() throws RecognitionException {
		StringLiteralsContext _localctx = new StringLiteralsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stringLiterals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(STRING_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberLiteralsContext extends ParserRuleContext {
		public TerminalNode INTEGER_() { return getToken(BaseRuleParser.INTEGER_, 0); }
		public TerminalNode NUMBER_() { return getToken(BaseRuleParser.NUMBER_, 0); }
		public TerminalNode PLUS_() { return getToken(BaseRuleParser.PLUS_, 0); }
		public TerminalNode MINUS_() { return getToken(BaseRuleParser.MINUS_, 0); }
		public NumberLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberLiterals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterNumberLiterals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitNumberLiterals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitNumberLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberLiteralsContext numberLiterals() throws RecognitionException {
		NumberLiteralsContext _localctx = new NumberLiteralsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_numberLiterals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS_ || _la==MINUS_) {
				{
				setState(371);
				_la = _input.LA(1);
				if ( !(_la==PLUS_ || _la==MINUS_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(374);
			_la = _input.LA(1);
			if ( !(_la==INTEGER_ || _la==NUMBER_) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DateTimeLiteralsContext extends ParserRuleContext {
		public TerminalNode STRING_() { return getToken(BaseRuleParser.STRING_, 0); }
		public TerminalNode DATE() { return getToken(BaseRuleParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(BaseRuleParser.TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(BaseRuleParser.TIMESTAMP, 0); }
		public TerminalNode LBE_() { return getToken(BaseRuleParser.LBE_, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RBE_() { return getToken(BaseRuleParser.RBE_, 0); }
		public DateTimeLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateTimeLiterals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterDateTimeLiterals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitDateTimeLiterals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitDateTimeLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateTimeLiteralsContext dateTimeLiterals() throws RecognitionException {
		DateTimeLiteralsContext _localctx = new DateTimeLiteralsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_dateTimeLiterals);
		int _la;
		try {
			setState(383);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DATE:
			case TIME:
			case TIMESTAMP:
				enterOuterAlt(_localctx, 1);
				{
				setState(376);
				_la = _input.LA(1);
				if ( !(((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (DATE - 130)) | (1L << (TIME - 130)) | (1L << (TIMESTAMP - 130)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(377);
				match(STRING_);
				}
				break;
			case LBE_:
				enterOuterAlt(_localctx, 2);
				{
				setState(378);
				match(LBE_);
				setState(379);
				identifier();
				setState(380);
				match(STRING_);
				setState(381);
				match(RBE_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HexadecimalLiteralsContext extends ParserRuleContext {
		public TerminalNode HEX_DIGIT_() { return getToken(BaseRuleParser.HEX_DIGIT_, 0); }
		public HexadecimalLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hexadecimalLiterals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterHexadecimalLiterals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitHexadecimalLiterals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitHexadecimalLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HexadecimalLiteralsContext hexadecimalLiterals() throws RecognitionException {
		HexadecimalLiteralsContext _localctx = new HexadecimalLiteralsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_hexadecimalLiterals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			match(HEX_DIGIT_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BitValueLiteralsContext extends ParserRuleContext {
		public TerminalNode BIT_NUM_() { return getToken(BaseRuleParser.BIT_NUM_, 0); }
		public BitValueLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitValueLiterals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterBitValueLiterals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitBitValueLiterals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitBitValueLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BitValueLiteralsContext bitValueLiterals() throws RecognitionException {
		BitValueLiteralsContext _localctx = new BitValueLiteralsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_bitValueLiterals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			match(BIT_NUM_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanLiteralsContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(BaseRuleParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(BaseRuleParser.FALSE, 0); }
		public BooleanLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiterals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterBooleanLiterals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitBooleanLiterals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitBooleanLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanLiteralsContext booleanLiterals() throws RecognitionException {
		BooleanLiteralsContext _localctx = new BooleanLiteralsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_booleanLiterals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NullValueLiteralsContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(BaseRuleParser.NULL, 0); }
		public NullValueLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullValueLiterals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterNullValueLiterals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitNullValueLiterals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitNullValueLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullValueLiteralsContext nullValueLiterals() throws RecognitionException {
		NullValueLiteralsContext _localctx = new NullValueLiteralsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_nullValueLiterals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			match(NULL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(BaseRuleParser.IDENTIFIER_, 0); }
		public UnreservedWordContext unreservedWord() {
			return getRuleContext(UnreservedWordContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_identifier);
		try {
			setState(395);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(393);
				match(IDENTIFIER_);
				}
				break;
			case TRUNCATE:
			case SCHEMA:
			case FUNCTION:
			case PROCEDURE:
			case CASE:
			case WHEN:
			case CAST:
			case TRIM:
			case SUBSTRING:
			case NATURAL:
			case JOIN:
			case FULL:
			case INNER:
			case OUTER:
			case LEFT:
			case RIGHT:
			case CROSS:
			case USING:
			case IF:
			case TRUE:
			case FALSE:
			case LIMIT:
			case OFFSET:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case BOOLEAN:
			case DOUBLE:
			case CHARACTER:
			case ARRAY:
			case INTERVAL:
			case TIME:
			case TIMESTAMP:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case YEAR:
			case QUARTER:
			case MONTH:
			case WEEK:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case MICROSECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case ENABLE:
			case DISABLE:
			case PRESERVE:
			case DO:
			case DEFINER:
			case CURRENT_USER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case COLLATION:
			case NAMES:
			case REAL:
			case TYPE:
			case BINARY:
			case ESCAPE:
			case MOD:
			case XOR:
			case UNKNOWN:
			case ALWAYS:
			case CASCADE:
			case GENERATED:
			case PRIVILEGES:
			case READ:
			case WRITE:
			case REFERENCES:
			case TRANSACTION:
			case ROLE:
			case VISIBLE:
			case INVISIBLE:
			case EXECUTE:
			case USE:
			case DEBUG:
			case UNDER:
			case FLASHBACK:
			case ARCHIVE:
			case REFRESH:
			case QUERY:
			case REWRITE:
			case KEEP:
			case SEQUENCE:
			case INHERIT:
			case TRANSLATE:
			case MERGE:
			case AT:
			case BITMAP:
			case CACHE:
			case NOCACHE:
			case CHECKPOINT:
			case CONSTRAINTS:
			case CYCLE:
			case NOCYCLE:
			case DBTIMEZONE:
			case ENCRYPT:
			case DECRYPT:
			case DEFERRABLE:
			case DEFERRED:
			case EDITION:
			case ELEMENT:
			case END:
			case EXCEPTIONS:
			case FORCE:
			case GLOBAL:
			case IDENTITY:
			case INITIALLY:
			case INVALIDATE:
			case JAVA:
			case LEVELS:
			case MAXVALUE:
			case MINVALUE:
			case NOMAXVALUE:
			case NOMINVALUE:
			case MINING:
			case MODEL:
			case NATIONAL:
			case NEW:
			case NOORDER:
			case NORELY:
			case ONLY:
			case PROFILE:
			case REF:
			case REKEY:
			case RELY:
			case REPLACE:
			case SALT:
			case SCOPE:
			case SORT:
			case SOURCE:
			case SUBSTITUTABLE:
			case TABLESPACE:
			case TEMPORARY:
			case TRANSLATION:
			case TREAT:
			case NO:
			case UNUSED:
			case NOVALIDATE:
			case VALUE:
			case VARYING:
			case VIRTUAL:
			case ZONE:
			case ADVISOR:
			case ADMINISTER:
			case TUNING:
			case MANAGE:
			case MANAGEMENT:
			case OBJECT:
			case CONTEXT:
			case EXEMPT:
			case REDACTION:
			case POLICY:
			case DATABASE:
			case SYSTEM:
			case LINK:
			case ANALYZE:
			case DICTIONARY:
			case DIMENSION:
			case INDEXTYPE:
			case EXTERNAL:
			case JOB:
			case CLASS:
			case PROGRAM:
			case SCHEDULER:
			case LIBRARY:
			case LOGMINING:
			case MATERIALIZED:
			case CUBE:
			case MEASURE:
			case FOLDER:
			case BUILD:
			case PROCESS:
			case OPERATOR:
			case OUTLINE:
			case PLUGGABLE:
			case CONTAINER:
			case SEGMENT:
			case RESTRICTED:
			case COST:
			case BACKUP:
			case UNLIMITED:
			case BECOME:
			case CHANGE:
			case NOTIFICATION:
			case PRIVILEGE:
			case PURGE:
			case RESUMABLE:
			case SYSGUID:
			case SYSBACKUP:
			case SYSDBA:
			case SYSDG:
			case SYSKM:
			case SYSOPER:
			case DBA_RECYCLEBIN:
			case FIRST:
			case RANK:
				enterOuterAlt(_localctx, 2);
				{
				setState(394);
				unreservedWord();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnreservedWordContext extends ParserRuleContext {
		public TerminalNode TRUNCATE() { return getToken(BaseRuleParser.TRUNCATE, 0); }
		public TerminalNode FUNCTION() { return getToken(BaseRuleParser.FUNCTION, 0); }
		public TerminalNode PROCEDURE() { return getToken(BaseRuleParser.PROCEDURE, 0); }
		public TerminalNode CASE() { return getToken(BaseRuleParser.CASE, 0); }
		public TerminalNode WHEN() { return getToken(BaseRuleParser.WHEN, 0); }
		public TerminalNode CAST() { return getToken(BaseRuleParser.CAST, 0); }
		public TerminalNode TRIM() { return getToken(BaseRuleParser.TRIM, 0); }
		public TerminalNode SUBSTRING() { return getToken(BaseRuleParser.SUBSTRING, 0); }
		public TerminalNode NATURAL() { return getToken(BaseRuleParser.NATURAL, 0); }
		public TerminalNode JOIN() { return getToken(BaseRuleParser.JOIN, 0); }
		public TerminalNode FULL() { return getToken(BaseRuleParser.FULL, 0); }
		public TerminalNode INNER() { return getToken(BaseRuleParser.INNER, 0); }
		public TerminalNode OUTER() { return getToken(BaseRuleParser.OUTER, 0); }
		public TerminalNode LEFT() { return getToken(BaseRuleParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(BaseRuleParser.RIGHT, 0); }
		public TerminalNode CROSS() { return getToken(BaseRuleParser.CROSS, 0); }
		public TerminalNode USING() { return getToken(BaseRuleParser.USING, 0); }
		public TerminalNode IF() { return getToken(BaseRuleParser.IF, 0); }
		public TerminalNode TRUE() { return getToken(BaseRuleParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(BaseRuleParser.FALSE, 0); }
		public TerminalNode LIMIT() { return getToken(BaseRuleParser.LIMIT, 0); }
		public TerminalNode OFFSET() { return getToken(BaseRuleParser.OFFSET, 0); }
		public TerminalNode BEGIN() { return getToken(BaseRuleParser.BEGIN, 0); }
		public TerminalNode COMMIT() { return getToken(BaseRuleParser.COMMIT, 0); }
		public TerminalNode ROLLBACK() { return getToken(BaseRuleParser.ROLLBACK, 0); }
		public TerminalNode SAVEPOINT() { return getToken(BaseRuleParser.SAVEPOINT, 0); }
		public TerminalNode BOOLEAN() { return getToken(BaseRuleParser.BOOLEAN, 0); }
		public TerminalNode DOUBLE() { return getToken(BaseRuleParser.DOUBLE, 0); }
		public TerminalNode CHARACTER() { return getToken(BaseRuleParser.CHARACTER, 0); }
		public TerminalNode ARRAY() { return getToken(BaseRuleParser.ARRAY, 0); }
		public TerminalNode INTERVAL() { return getToken(BaseRuleParser.INTERVAL, 0); }
		public TerminalNode TIME() { return getToken(BaseRuleParser.TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(BaseRuleParser.TIMESTAMP, 0); }
		public TerminalNode LOCALTIME() { return getToken(BaseRuleParser.LOCALTIME, 0); }
		public TerminalNode LOCALTIMESTAMP() { return getToken(BaseRuleParser.LOCALTIMESTAMP, 0); }
		public TerminalNode YEAR() { return getToken(BaseRuleParser.YEAR, 0); }
		public TerminalNode QUARTER() { return getToken(BaseRuleParser.QUARTER, 0); }
		public TerminalNode MONTH() { return getToken(BaseRuleParser.MONTH, 0); }
		public TerminalNode WEEK() { return getToken(BaseRuleParser.WEEK, 0); }
		public TerminalNode DAY() { return getToken(BaseRuleParser.DAY, 0); }
		public TerminalNode HOUR() { return getToken(BaseRuleParser.HOUR, 0); }
		public TerminalNode MINUTE() { return getToken(BaseRuleParser.MINUTE, 0); }
		public TerminalNode SECOND() { return getToken(BaseRuleParser.SECOND, 0); }
		public TerminalNode MICROSECOND() { return getToken(BaseRuleParser.MICROSECOND, 0); }
		public TerminalNode MAX() { return getToken(BaseRuleParser.MAX, 0); }
		public TerminalNode MIN() { return getToken(BaseRuleParser.MIN, 0); }
		public TerminalNode SUM() { return getToken(BaseRuleParser.SUM, 0); }
		public TerminalNode COUNT() { return getToken(BaseRuleParser.COUNT, 0); }
		public TerminalNode AVG() { return getToken(BaseRuleParser.AVG, 0); }
		public TerminalNode ENABLE() { return getToken(BaseRuleParser.ENABLE, 0); }
		public TerminalNode DISABLE() { return getToken(BaseRuleParser.DISABLE, 0); }
		public TerminalNode BINARY() { return getToken(BaseRuleParser.BINARY, 0); }
		public TerminalNode ESCAPE() { return getToken(BaseRuleParser.ESCAPE, 0); }
		public TerminalNode MOD() { return getToken(BaseRuleParser.MOD, 0); }
		public TerminalNode UNKNOWN() { return getToken(BaseRuleParser.UNKNOWN, 0); }
		public TerminalNode XOR() { return getToken(BaseRuleParser.XOR, 0); }
		public TerminalNode ALWAYS() { return getToken(BaseRuleParser.ALWAYS, 0); }
		public TerminalNode CASCADE() { return getToken(BaseRuleParser.CASCADE, 0); }
		public TerminalNode GENERATED() { return getToken(BaseRuleParser.GENERATED, 0); }
		public TerminalNode PRIVILEGES() { return getToken(BaseRuleParser.PRIVILEGES, 0); }
		public TerminalNode READ() { return getToken(BaseRuleParser.READ, 0); }
		public TerminalNode WRITE() { return getToken(BaseRuleParser.WRITE, 0); }
		public TerminalNode REFERENCES() { return getToken(BaseRuleParser.REFERENCES, 0); }
		public TerminalNode TRANSACTION() { return getToken(BaseRuleParser.TRANSACTION, 0); }
		public TerminalNode ROLE() { return getToken(BaseRuleParser.ROLE, 0); }
		public TerminalNode VISIBLE() { return getToken(BaseRuleParser.VISIBLE, 0); }
		public TerminalNode INVISIBLE() { return getToken(BaseRuleParser.INVISIBLE, 0); }
		public TerminalNode EXECUTE() { return getToken(BaseRuleParser.EXECUTE, 0); }
		public TerminalNode USE() { return getToken(BaseRuleParser.USE, 0); }
		public TerminalNode DEBUG() { return getToken(BaseRuleParser.DEBUG, 0); }
		public TerminalNode UNDER() { return getToken(BaseRuleParser.UNDER, 0); }
		public TerminalNode FLASHBACK() { return getToken(BaseRuleParser.FLASHBACK, 0); }
		public TerminalNode ARCHIVE() { return getToken(BaseRuleParser.ARCHIVE, 0); }
		public TerminalNode REFRESH() { return getToken(BaseRuleParser.REFRESH, 0); }
		public TerminalNode QUERY() { return getToken(BaseRuleParser.QUERY, 0); }
		public TerminalNode REWRITE() { return getToken(BaseRuleParser.REWRITE, 0); }
		public TerminalNode KEEP() { return getToken(BaseRuleParser.KEEP, 0); }
		public TerminalNode SEQUENCE() { return getToken(BaseRuleParser.SEQUENCE, 0); }
		public TerminalNode INHERIT() { return getToken(BaseRuleParser.INHERIT, 0); }
		public TerminalNode TRANSLATE() { return getToken(BaseRuleParser.TRANSLATE, 0); }
		public TerminalNode SQL() { return getToken(BaseRuleParser.SQL, 0); }
		public TerminalNode MERGE() { return getToken(BaseRuleParser.MERGE, 0); }
		public TerminalNode AT() { return getToken(BaseRuleParser.AT, 0); }
		public TerminalNode BITMAP() { return getToken(BaseRuleParser.BITMAP, 0); }
		public TerminalNode CACHE() { return getToken(BaseRuleParser.CACHE, 0); }
		public TerminalNode CHECKPOINT() { return getToken(BaseRuleParser.CHECKPOINT, 0); }
		public TerminalNode CONSTRAINTS() { return getToken(BaseRuleParser.CONSTRAINTS, 0); }
		public TerminalNode CYCLE() { return getToken(BaseRuleParser.CYCLE, 0); }
		public TerminalNode DBTIMEZONE() { return getToken(BaseRuleParser.DBTIMEZONE, 0); }
		public TerminalNode ENCRYPT() { return getToken(BaseRuleParser.ENCRYPT, 0); }
		public TerminalNode DECRYPT() { return getToken(BaseRuleParser.DECRYPT, 0); }
		public TerminalNode DEFERRABLE() { return getToken(BaseRuleParser.DEFERRABLE, 0); }
		public TerminalNode DEFERRED() { return getToken(BaseRuleParser.DEFERRED, 0); }
		public TerminalNode EDITION() { return getToken(BaseRuleParser.EDITION, 0); }
		public TerminalNode ELEMENT() { return getToken(BaseRuleParser.ELEMENT, 0); }
		public TerminalNode END() { return getToken(BaseRuleParser.END, 0); }
		public TerminalNode EXCEPTIONS() { return getToken(BaseRuleParser.EXCEPTIONS, 0); }
		public TerminalNode FORCE() { return getToken(BaseRuleParser.FORCE, 0); }
		public TerminalNode GLOBAL() { return getToken(BaseRuleParser.GLOBAL, 0); }
		public TerminalNode IDENTITY() { return getToken(BaseRuleParser.IDENTITY, 0); }
		public TerminalNode INITIALLY() { return getToken(BaseRuleParser.INITIALLY, 0); }
		public TerminalNode INVALIDATE() { return getToken(BaseRuleParser.INVALIDATE, 0); }
		public TerminalNode JAVA() { return getToken(BaseRuleParser.JAVA, 0); }
		public TerminalNode LEVELS() { return getToken(BaseRuleParser.LEVELS, 0); }
		public TerminalNode LOCAL() { return getToken(BaseRuleParser.LOCAL, 0); }
		public TerminalNode MAXVALUE() { return getToken(BaseRuleParser.MAXVALUE, 0); }
		public TerminalNode MINVALUE() { return getToken(BaseRuleParser.MINVALUE, 0); }
		public TerminalNode NOMAXVALUE() { return getToken(BaseRuleParser.NOMAXVALUE, 0); }
		public TerminalNode NOMINVALUE() { return getToken(BaseRuleParser.NOMINVALUE, 0); }
		public TerminalNode MINING() { return getToken(BaseRuleParser.MINING, 0); }
		public TerminalNode MODEL() { return getToken(BaseRuleParser.MODEL, 0); }
		public TerminalNode NATIONAL() { return getToken(BaseRuleParser.NATIONAL, 0); }
		public TerminalNode NEW() { return getToken(BaseRuleParser.NEW, 0); }
		public TerminalNode NOCACHE() { return getToken(BaseRuleParser.NOCACHE, 0); }
		public TerminalNode NOCYCLE() { return getToken(BaseRuleParser.NOCYCLE, 0); }
		public TerminalNode NOORDER() { return getToken(BaseRuleParser.NOORDER, 0); }
		public TerminalNode NORELY() { return getToken(BaseRuleParser.NORELY, 0); }
		public TerminalNode NOVALIDATE() { return getToken(BaseRuleParser.NOVALIDATE, 0); }
		public TerminalNode ONLY() { return getToken(BaseRuleParser.ONLY, 0); }
		public TerminalNode PRESERVE() { return getToken(BaseRuleParser.PRESERVE, 0); }
		public TerminalNode PROFILE() { return getToken(BaseRuleParser.PROFILE, 0); }
		public TerminalNode REF() { return getToken(BaseRuleParser.REF, 0); }
		public TerminalNode REKEY() { return getToken(BaseRuleParser.REKEY, 0); }
		public TerminalNode RELY() { return getToken(BaseRuleParser.RELY, 0); }
		public TerminalNode REPLACE() { return getToken(BaseRuleParser.REPLACE, 0); }
		public TerminalNode SOURCE() { return getToken(BaseRuleParser.SOURCE, 0); }
		public TerminalNode SALT() { return getToken(BaseRuleParser.SALT, 0); }
		public TerminalNode SCOPE() { return getToken(BaseRuleParser.SCOPE, 0); }
		public TerminalNode SORT() { return getToken(BaseRuleParser.SORT, 0); }
		public TerminalNode SUBSTITUTABLE() { return getToken(BaseRuleParser.SUBSTITUTABLE, 0); }
		public TerminalNode TABLESPACE() { return getToken(BaseRuleParser.TABLESPACE, 0); }
		public TerminalNode TEMPORARY() { return getToken(BaseRuleParser.TEMPORARY, 0); }
		public TerminalNode TRANSLATION() { return getToken(BaseRuleParser.TRANSLATION, 0); }
		public TerminalNode TREAT() { return getToken(BaseRuleParser.TREAT, 0); }
		public TerminalNode NO() { return getToken(BaseRuleParser.NO, 0); }
		public TerminalNode TYPE() { return getToken(BaseRuleParser.TYPE, 0); }
		public TerminalNode UNUSED() { return getToken(BaseRuleParser.UNUSED, 0); }
		public TerminalNode VALUE() { return getToken(BaseRuleParser.VALUE, 0); }
		public TerminalNode VARYING() { return getToken(BaseRuleParser.VARYING, 0); }
		public TerminalNode VIRTUAL() { return getToken(BaseRuleParser.VIRTUAL, 0); }
		public TerminalNode ZONE() { return getToken(BaseRuleParser.ZONE, 0); }
		public TerminalNode ADVISOR() { return getToken(BaseRuleParser.ADVISOR, 0); }
		public TerminalNode ADMINISTER() { return getToken(BaseRuleParser.ADMINISTER, 0); }
		public TerminalNode TUNING() { return getToken(BaseRuleParser.TUNING, 0); }
		public TerminalNode MANAGE() { return getToken(BaseRuleParser.MANAGE, 0); }
		public TerminalNode MANAGEMENT() { return getToken(BaseRuleParser.MANAGEMENT, 0); }
		public TerminalNode OBJECT() { return getToken(BaseRuleParser.OBJECT, 0); }
		public TerminalNode CONTEXT() { return getToken(BaseRuleParser.CONTEXT, 0); }
		public TerminalNode EXEMPT() { return getToken(BaseRuleParser.EXEMPT, 0); }
		public TerminalNode REDACTION() { return getToken(BaseRuleParser.REDACTION, 0); }
		public TerminalNode POLICY() { return getToken(BaseRuleParser.POLICY, 0); }
		public TerminalNode DATABASE() { return getToken(BaseRuleParser.DATABASE, 0); }
		public TerminalNode SYSTEM() { return getToken(BaseRuleParser.SYSTEM, 0); }
		public TerminalNode LINK() { return getToken(BaseRuleParser.LINK, 0); }
		public TerminalNode ANALYZE() { return getToken(BaseRuleParser.ANALYZE, 0); }
		public TerminalNode DICTIONARY() { return getToken(BaseRuleParser.DICTIONARY, 0); }
		public TerminalNode DIMENSION() { return getToken(BaseRuleParser.DIMENSION, 0); }
		public TerminalNode INDEXTYPE() { return getToken(BaseRuleParser.INDEXTYPE, 0); }
		public TerminalNode EXTERNAL() { return getToken(BaseRuleParser.EXTERNAL, 0); }
		public TerminalNode JOB() { return getToken(BaseRuleParser.JOB, 0); }
		public TerminalNode CLASS() { return getToken(BaseRuleParser.CLASS, 0); }
		public TerminalNode PROGRAM() { return getToken(BaseRuleParser.PROGRAM, 0); }
		public TerminalNode SCHEDULER() { return getToken(BaseRuleParser.SCHEDULER, 0); }
		public TerminalNode LIBRARY() { return getToken(BaseRuleParser.LIBRARY, 0); }
		public TerminalNode LOGMINING() { return getToken(BaseRuleParser.LOGMINING, 0); }
		public TerminalNode MATERIALIZED() { return getToken(BaseRuleParser.MATERIALIZED, 0); }
		public TerminalNode CUBE() { return getToken(BaseRuleParser.CUBE, 0); }
		public TerminalNode MEASURE() { return getToken(BaseRuleParser.MEASURE, 0); }
		public TerminalNode FOLDER() { return getToken(BaseRuleParser.FOLDER, 0); }
		public TerminalNode BUILD() { return getToken(BaseRuleParser.BUILD, 0); }
		public TerminalNode PROCESS() { return getToken(BaseRuleParser.PROCESS, 0); }
		public TerminalNode OPERATOR() { return getToken(BaseRuleParser.OPERATOR, 0); }
		public TerminalNode OUTLINE() { return getToken(BaseRuleParser.OUTLINE, 0); }
		public TerminalNode PLUGGABLE() { return getToken(BaseRuleParser.PLUGGABLE, 0); }
		public TerminalNode CONTAINER() { return getToken(BaseRuleParser.CONTAINER, 0); }
		public TerminalNode SEGMENT() { return getToken(BaseRuleParser.SEGMENT, 0); }
		public TerminalNode RESTRICTED() { return getToken(BaseRuleParser.RESTRICTED, 0); }
		public TerminalNode COST() { return getToken(BaseRuleParser.COST, 0); }
		public TerminalNode BACKUP() { return getToken(BaseRuleParser.BACKUP, 0); }
		public TerminalNode UNLIMITED() { return getToken(BaseRuleParser.UNLIMITED, 0); }
		public TerminalNode BECOME() { return getToken(BaseRuleParser.BECOME, 0); }
		public TerminalNode CHANGE() { return getToken(BaseRuleParser.CHANGE, 0); }
		public TerminalNode NOTIFICATION() { return getToken(BaseRuleParser.NOTIFICATION, 0); }
		public TerminalNode PRIVILEGE() { return getToken(BaseRuleParser.PRIVILEGE, 0); }
		public TerminalNode PURGE() { return getToken(BaseRuleParser.PURGE, 0); }
		public TerminalNode RESUMABLE() { return getToken(BaseRuleParser.RESUMABLE, 0); }
		public TerminalNode SYSGUID() { return getToken(BaseRuleParser.SYSGUID, 0); }
		public TerminalNode SYSBACKUP() { return getToken(BaseRuleParser.SYSBACKUP, 0); }
		public TerminalNode SYSDBA() { return getToken(BaseRuleParser.SYSDBA, 0); }
		public TerminalNode SYSDG() { return getToken(BaseRuleParser.SYSDG, 0); }
		public TerminalNode SYSKM() { return getToken(BaseRuleParser.SYSKM, 0); }
		public TerminalNode SYSOPER() { return getToken(BaseRuleParser.SYSOPER, 0); }
		public TerminalNode DBA_RECYCLEBIN() { return getToken(BaseRuleParser.DBA_RECYCLEBIN, 0); }
		public TerminalNode SCHEMA() { return getToken(BaseRuleParser.SCHEMA, 0); }
		public TerminalNode DO() { return getToken(BaseRuleParser.DO, 0); }
		public TerminalNode DEFINER() { return getToken(BaseRuleParser.DEFINER, 0); }
		public TerminalNode CURRENT_USER() { return getToken(BaseRuleParser.CURRENT_USER, 0); }
		public TerminalNode CASCADED() { return getToken(BaseRuleParser.CASCADED, 0); }
		public TerminalNode CLOSE() { return getToken(BaseRuleParser.CLOSE, 0); }
		public TerminalNode OPEN() { return getToken(BaseRuleParser.OPEN, 0); }
		public TerminalNode NEXT() { return getToken(BaseRuleParser.NEXT, 0); }
		public TerminalNode NAME() { return getToken(BaseRuleParser.NAME, 0); }
		public TerminalNode NAMES() { return getToken(BaseRuleParser.NAMES, 0); }
		public TerminalNode COLLATION() { return getToken(BaseRuleParser.COLLATION, 0); }
		public TerminalNode REAL() { return getToken(BaseRuleParser.REAL, 0); }
		public TerminalNode FIRST() { return getToken(BaseRuleParser.FIRST, 0); }
		public TerminalNode RANK() { return getToken(BaseRuleParser.RANK, 0); }
		public UnreservedWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unreservedWord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterUnreservedWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitUnreservedWord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitUnreservedWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnreservedWordContext unreservedWord() throws RecognitionException {
		UnreservedWordContext _localctx = new UnreservedWordContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_unreservedWord);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			_la = _input.LA(1);
			if ( !(((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (TRUNCATE - 51)) | (1L << (SCHEMA - 51)) | (1L << (FUNCTION - 51)) | (1L << (PROCEDURE - 51)) | (1L << (CASE - 51)) | (1L << (WHEN - 51)) | (1L << (CAST - 51)) | (1L << (TRIM - 51)) | (1L << (SUBSTRING - 51)) | (1L << (NATURAL - 51)) | (1L << (JOIN - 51)) | (1L << (FULL - 51)) | (1L << (INNER - 51)) | (1L << (OUTER - 51)) | (1L << (LEFT - 51)) | (1L << (RIGHT - 51)) | (1L << (CROSS - 51)) | (1L << (USING - 51)) | (1L << (IF - 51)) | (1L << (TRUE - 51)) | (1L << (FALSE - 51)))) != 0) || ((((_la - 118)) & ~0x3f) == 0 && ((1L << (_la - 118)) & ((1L << (LIMIT - 118)) | (1L << (OFFSET - 118)) | (1L << (BEGIN - 118)) | (1L << (COMMIT - 118)) | (1L << (ROLLBACK - 118)) | (1L << (SAVEPOINT - 118)) | (1L << (BOOLEAN - 118)) | (1L << (DOUBLE - 118)) | (1L << (CHARACTER - 118)) | (1L << (ARRAY - 118)) | (1L << (INTERVAL - 118)) | (1L << (TIME - 118)) | (1L << (TIMESTAMP - 118)) | (1L << (LOCALTIME - 118)) | (1L << (LOCALTIMESTAMP - 118)) | (1L << (YEAR - 118)) | (1L << (QUARTER - 118)) | (1L << (MONTH - 118)) | (1L << (WEEK - 118)) | (1L << (DAY - 118)) | (1L << (HOUR - 118)) | (1L << (MINUTE - 118)) | (1L << (SECOND - 118)) | (1L << (MICROSECOND - 118)) | (1L << (MAX - 118)) | (1L << (MIN - 118)) | (1L << (SUM - 118)) | (1L << (COUNT - 118)) | (1L << (AVG - 118)) | (1L << (ENABLE - 118)) | (1L << (DISABLE - 118)) | (1L << (PRESERVE - 118)) | (1L << (DO - 118)) | (1L << (DEFINER - 118)) | (1L << (CURRENT_USER - 118)) | (1L << (SQL - 118)) | (1L << (CASCADED - 118)) | (1L << (LOCAL - 118)) | (1L << (CLOSE - 118)) | (1L << (OPEN - 118)) | (1L << (NEXT - 118)) | (1L << (NAME - 118)) | (1L << (COLLATION - 118)) | (1L << (NAMES - 118)) | (1L << (REAL - 118)) | (1L << (TYPE - 118)) | (1L << (BINARY - 118)) | (1L << (ESCAPE - 118)))) != 0) || ((((_la - 182)) & ~0x3f) == 0 && ((1L << (_la - 182)) & ((1L << (MOD - 182)) | (1L << (XOR - 182)) | (1L << (UNKNOWN - 182)) | (1L << (ALWAYS - 182)) | (1L << (CASCADE - 182)) | (1L << (GENERATED - 182)) | (1L << (PRIVILEGES - 182)) | (1L << (READ - 182)) | (1L << (WRITE - 182)) | (1L << (REFERENCES - 182)) | (1L << (TRANSACTION - 182)) | (1L << (ROLE - 182)) | (1L << (VISIBLE - 182)) | (1L << (INVISIBLE - 182)) | (1L << (EXECUTE - 182)) | (1L << (USE - 182)) | (1L << (DEBUG - 182)) | (1L << (UNDER - 182)) | (1L << (FLASHBACK - 182)) | (1L << (ARCHIVE - 182)) | (1L << (REFRESH - 182)) | (1L << (QUERY - 182)) | (1L << (REWRITE - 182)) | (1L << (KEEP - 182)) | (1L << (SEQUENCE - 182)) | (1L << (INHERIT - 182)) | (1L << (TRANSLATE - 182)) | (1L << (MERGE - 182)) | (1L << (AT - 182)) | (1L << (BITMAP - 182)) | (1L << (CACHE - 182)) | (1L << (NOCACHE - 182)) | (1L << (CHECKPOINT - 182)) | (1L << (CONSTRAINTS - 182)) | (1L << (CYCLE - 182)) | (1L << (NOCYCLE - 182)) | (1L << (DBTIMEZONE - 182)) | (1L << (ENCRYPT - 182)) | (1L << (DECRYPT - 182)) | (1L << (DEFERRABLE - 182)) | (1L << (DEFERRED - 182)) | (1L << (EDITION - 182)) | (1L << (ELEMENT - 182)) | (1L << (END - 182)) | (1L << (EXCEPTIONS - 182)) | (1L << (FORCE - 182)) | (1L << (GLOBAL - 182)) | (1L << (IDENTITY - 182)) | (1L << (INITIALLY - 182)) | (1L << (INVALIDATE - 182)) | (1L << (JAVA - 182)) | (1L << (LEVELS - 182)) | (1L << (MAXVALUE - 182)))) != 0) || ((((_la - 246)) & ~0x3f) == 0 && ((1L << (_la - 246)) & ((1L << (MINVALUE - 246)) | (1L << (NOMAXVALUE - 246)) | (1L << (NOMINVALUE - 246)) | (1L << (MINING - 246)) | (1L << (MODEL - 246)) | (1L << (NATIONAL - 246)) | (1L << (NEW - 246)) | (1L << (NOORDER - 246)) | (1L << (NORELY - 246)) | (1L << (ONLY - 246)) | (1L << (PROFILE - 246)) | (1L << (REF - 246)) | (1L << (REKEY - 246)) | (1L << (RELY - 246)) | (1L << (REPLACE - 246)) | (1L << (SALT - 246)) | (1L << (SCOPE - 246)) | (1L << (SORT - 246)) | (1L << (SOURCE - 246)) | (1L << (SUBSTITUTABLE - 246)) | (1L << (TABLESPACE - 246)) | (1L << (TEMPORARY - 246)) | (1L << (TRANSLATION - 246)) | (1L << (TREAT - 246)) | (1L << (NO - 246)) | (1L << (UNUSED - 246)) | (1L << (NOVALIDATE - 246)) | (1L << (VALUE - 246)) | (1L << (VARYING - 246)) | (1L << (VIRTUAL - 246)) | (1L << (ZONE - 246)) | (1L << (ADVISOR - 246)) | (1L << (ADMINISTER - 246)) | (1L << (TUNING - 246)) | (1L << (MANAGE - 246)) | (1L << (MANAGEMENT - 246)) | (1L << (OBJECT - 246)) | (1L << (CONTEXT - 246)) | (1L << (EXEMPT - 246)) | (1L << (REDACTION - 246)) | (1L << (POLICY - 246)) | (1L << (DATABASE - 246)) | (1L << (SYSTEM - 246)) | (1L << (LINK - 246)) | (1L << (ANALYZE - 246)) | (1L << (DICTIONARY - 246)) | (1L << (DIMENSION - 246)) | (1L << (INDEXTYPE - 246)))) != 0) || ((((_la - 310)) & ~0x3f) == 0 && ((1L << (_la - 310)) & ((1L << (EXTERNAL - 310)) | (1L << (JOB - 310)) | (1L << (CLASS - 310)) | (1L << (PROGRAM - 310)) | (1L << (SCHEDULER - 310)) | (1L << (LIBRARY - 310)) | (1L << (LOGMINING - 310)) | (1L << (MATERIALIZED - 310)) | (1L << (CUBE - 310)) | (1L << (MEASURE - 310)) | (1L << (FOLDER - 310)) | (1L << (BUILD - 310)) | (1L << (PROCESS - 310)) | (1L << (OPERATOR - 310)) | (1L << (OUTLINE - 310)) | (1L << (PLUGGABLE - 310)) | (1L << (CONTAINER - 310)) | (1L << (SEGMENT - 310)) | (1L << (RESTRICTED - 310)) | (1L << (COST - 310)) | (1L << (BACKUP - 310)) | (1L << (UNLIMITED - 310)) | (1L << (BECOME - 310)) | (1L << (CHANGE - 310)) | (1L << (NOTIFICATION - 310)) | (1L << (PRIVILEGE - 310)) | (1L << (PURGE - 310)) | (1L << (RESUMABLE - 310)) | (1L << (SYSGUID - 310)) | (1L << (SYSBACKUP - 310)) | (1L << (SYSDBA - 310)) | (1L << (SYSDG - 310)) | (1L << (SYSKM - 310)) | (1L << (SYSOPER - 310)) | (1L << (DBA_RECYCLEBIN - 310)) | (1L << (FIRST - 310)))) != 0) || _la==RANK) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SchemaNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SchemaNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemaName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterSchemaName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitSchemaName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitSchemaName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SchemaNameContext schemaName() throws RecognitionException {
		SchemaNameContext _localctx = new SchemaNameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_schemaName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableNameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public OwnerContext owner() {
			return getRuleContext(OwnerContext.class,0);
		}
		public TerminalNode DOT_() { return getToken(BaseRuleParser.DOT_, 0); }
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(401);
				owner();
				setState(402);
				match(DOT_);
				}
				break;
			}
			setState(406);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ViewNameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public OwnerContext owner() {
			return getRuleContext(OwnerContext.class,0);
		}
		public TerminalNode DOT_() { return getToken(BaseRuleParser.DOT_, 0); }
		public ViewNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_viewName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterViewName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitViewName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitViewName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ViewNameContext viewName() throws RecognitionException {
		ViewNameContext _localctx = new ViewNameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_viewName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(408);
				owner();
				setState(409);
				match(DOT_);
				}
				break;
			}
			setState(413);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MaterializedViewNameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public OwnerContext owner() {
			return getRuleContext(OwnerContext.class,0);
		}
		public TerminalNode DOT_() { return getToken(BaseRuleParser.DOT_, 0); }
		public MaterializedViewNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_materializedViewName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterMaterializedViewName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitMaterializedViewName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitMaterializedViewName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MaterializedViewNameContext materializedViewName() throws RecognitionException {
		MaterializedViewNameContext _localctx = new MaterializedViewNameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_materializedViewName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(415);
				owner();
				setState(416);
				match(DOT_);
				}
				break;
			}
			setState(420);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnNameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public OwnerContext owner() {
			return getRuleContext(OwnerContext.class,0);
		}
		public TerminalNode DOT_() { return getToken(BaseRuleParser.DOT_, 0); }
		public ColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterColumnName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitColumnName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitColumnName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNameContext columnName() throws RecognitionException {
		ColumnNameContext _localctx = new ColumnNameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_columnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(422);
				owner();
				setState(423);
				match(DOT_);
				}
				break;
			}
			setState(427);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectNameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public OwnerContext owner() {
			return getRuleContext(OwnerContext.class,0);
		}
		public TerminalNode DOT_() { return getToken(BaseRuleParser.DOT_, 0); }
		public ObjectNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterObjectName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitObjectName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitObjectName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectNameContext objectName() throws RecognitionException {
		ObjectNameContext _localctx = new ObjectNameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_objectName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(429);
				owner();
				setState(430);
				match(DOT_);
				}
				break;
			}
			setState(434);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClusterNameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public OwnerContext owner() {
			return getRuleContext(OwnerContext.class,0);
		}
		public TerminalNode DOT_() { return getToken(BaseRuleParser.DOT_, 0); }
		public ClusterNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clusterName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterClusterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitClusterName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitClusterName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClusterNameContext clusterName() throws RecognitionException {
		ClusterNameContext _localctx = new ClusterNameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_clusterName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(436);
				owner();
				setState(437);
				match(DOT_);
				}
				break;
			}
			setState(441);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexNameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public OwnerContext owner() {
			return getRuleContext(OwnerContext.class,0);
		}
		public TerminalNode DOT_() { return getToken(BaseRuleParser.DOT_, 0); }
		public IndexNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterIndexName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitIndexName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitIndexName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexNameContext indexName() throws RecognitionException {
		IndexNameContext _localctx = new IndexNameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_indexName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(443);
				owner();
				setState(444);
				match(DOT_);
				}
				break;
			}
			setState(448);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatisticsTypeNameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public OwnerContext owner() {
			return getRuleContext(OwnerContext.class,0);
		}
		public TerminalNode DOT_() { return getToken(BaseRuleParser.DOT_, 0); }
		public StatisticsTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statisticsTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterStatisticsTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitStatisticsTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitStatisticsTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatisticsTypeNameContext statisticsTypeName() throws RecognitionException {
		StatisticsTypeNameContext _localctx = new StatisticsTypeNameContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_statisticsTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(450);
				owner();
				setState(451);
				match(DOT_);
				}
				break;
			}
			setState(455);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public OwnerContext owner() {
			return getRuleContext(OwnerContext.class,0);
		}
		public TerminalNode DOT_() { return getToken(BaseRuleParser.DOT_, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(457);
				owner();
				setState(458);
				match(DOT_);
				}
				break;
			}
			setState(462);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageNameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public OwnerContext owner() {
			return getRuleContext(OwnerContext.class,0);
		}
		public TerminalNode DOT_() { return getToken(BaseRuleParser.DOT_, 0); }
		public PackageNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterPackageName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitPackageName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitPackageName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageNameContext packageName() throws RecognitionException {
		PackageNameContext _localctx = new PackageNameContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_packageName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(464);
				owner();
				setState(465);
				match(DOT_);
				}
				break;
			}
			setState(469);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeNameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public OwnerContext owner() {
			return getRuleContext(OwnerContext.class,0);
		}
		public TerminalNode DOT_() { return getToken(BaseRuleParser.DOT_, 0); }
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_typeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(471);
				owner();
				setState(472);
				match(DOT_);
				}
				break;
			}
			setState(476);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexTypeNameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public OwnerContext owner() {
			return getRuleContext(OwnerContext.class,0);
		}
		public TerminalNode DOT_() { return getToken(BaseRuleParser.DOT_, 0); }
		public IndexTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterIndexTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitIndexTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitIndexTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexTypeNameContext indexTypeName() throws RecognitionException {
		IndexTypeNameContext _localctx = new IndexTypeNameContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_indexTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(478);
				owner();
				setState(479);
				match(DOT_);
				}
				break;
			}
			setState(483);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstraintNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ConstraintNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterConstraintName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitConstraintName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitConstraintName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstraintNameContext constraintName() throws RecognitionException {
		ConstraintNameContext _localctx = new ConstraintNameContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_constraintName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SavepointNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SavepointNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepointName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterSavepointName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitSavepointName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitSavepointName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SavepointNameContext savepointName() throws RecognitionException {
		SavepointNameContext _localctx = new SavepointNameContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_savepointName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SynonymNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SynonymNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synonymName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterSynonymName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitSynonymName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitSynonymName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynonymNameContext synonymName() throws RecognitionException {
		SynonymNameContext _localctx = new SynonymNameContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_synonymName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OwnerContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public OwnerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_owner; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterOwner(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitOwner(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitOwner(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OwnerContext owner() throws RecognitionException {
		OwnerContext _localctx = new OwnerContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_owner);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablespaceNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TablespaceNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablespaceName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterTablespaceName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitTablespaceName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitTablespaceName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablespaceNameContext tablespaceName() throws RecognitionException {
		TablespaceNameContext _localctx = new TablespaceNameContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_tablespaceName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablespaceSetNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TablespaceSetNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablespaceSetName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterTablespaceSetName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitTablespaceSetName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitTablespaceSetName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablespaceSetNameContext tablespaceSetName() throws RecognitionException {
		TablespaceSetNameContext _localctx = new TablespaceSetNameContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_tablespaceSetName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ServiceNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ServiceNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serviceName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterServiceName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitServiceName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitServiceName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ServiceNameContext serviceName() throws RecognitionException {
		ServiceNameContext _localctx = new ServiceNameContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_serviceName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IlmPolicyNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IlmPolicyNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ilmPolicyName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterIlmPolicyName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitIlmPolicyName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitIlmPolicyName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IlmPolicyNameContext ilmPolicyName() throws RecognitionException {
		IlmPolicyNameContext _localctx = new IlmPolicyNameContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_ilmPolicyName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PolicyNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PolicyNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_policyName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterPolicyName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitPolicyName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitPolicyName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PolicyNameContext policyName() throws RecognitionException {
		PolicyNameContext _localctx = new PolicyNameContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_policyName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitFunctionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_functionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DbLinkContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DbLinkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dbLink; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterDbLink(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitDbLink(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitDbLink(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DbLinkContext dbLink() throws RecognitionException {
		DbLinkContext _localctx = new DbLinkContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_dbLink);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterValueContext extends ParserRuleContext {
		public LiteralsContext literals() {
			return getRuleContext(LiteralsContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ParameterValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterParameterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitParameterValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitParameterValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterValueContext parameterValue() throws RecognitionException {
		ParameterValueContext _localctx = new ParameterValueContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_parameterValue);
		try {
			setState(511);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(509);
				literals();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(510);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirectoryNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DirectoryNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directoryName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterDirectoryName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitDirectoryName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitDirectoryName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectoryNameContext directoryName() throws RecognitionException {
		DirectoryNameContext _localctx = new DirectoryNameContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_directoryName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DispatcherNameContext extends ParserRuleContext {
		public StringLiteralsContext stringLiterals() {
			return getRuleContext(StringLiteralsContext.class,0);
		}
		public DispatcherNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dispatcherName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterDispatcherName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitDispatcherName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitDispatcherName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DispatcherNameContext dispatcherName() throws RecognitionException {
		DispatcherNameContext _localctx = new DispatcherNameContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_dispatcherName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			stringLiterals();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClientIdContext extends ParserRuleContext {
		public StringLiteralsContext stringLiterals() {
			return getRuleContext(StringLiteralsContext.class,0);
		}
		public ClientIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clientId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterClientId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitClientId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitClientId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClientIdContext clientId() throws RecognitionException {
		ClientIdContext _localctx = new ClientIdContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_clientId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			stringLiterals();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpaqueFormatSpecContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public OpaqueFormatSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opaqueFormatSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterOpaqueFormatSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitOpaqueFormatSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitOpaqueFormatSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpaqueFormatSpecContext opaqueFormatSpec() throws RecognitionException {
		OpaqueFormatSpecContext _localctx = new OpaqueFormatSpecContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_opaqueFormatSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AccessDriverTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AccessDriverTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessDriverType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterAccessDriverType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitAccessDriverType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitAccessDriverType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessDriverTypeContext accessDriverType() throws RecognitionException {
		AccessDriverTypeContext _localctx = new AccessDriverTypeContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_accessDriverType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarrayItemContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public VarrayItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varrayItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterVarrayItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitVarrayItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitVarrayItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarrayItemContext varrayItem() throws RecognitionException {
		VarrayItemContext _localctx = new VarrayItemContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_varrayItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NestedItemContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NestedItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterNestedItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitNestedItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitNestedItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestedItemContext nestedItem() throws RecognitionException {
		NestedItemContext _localctx = new NestedItemContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_nestedItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StorageTableContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StorageTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterStorageTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitStorageTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitStorageTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StorageTableContext storageTable() throws RecognitionException {
		StorageTableContext _localctx = new StorageTableContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_storageTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LobSegnameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LobSegnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lobSegname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterLobSegname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitLobSegname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitLobSegname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LobSegnameContext lobSegname() throws RecognitionException {
		LobSegnameContext _localctx = new LobSegnameContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_lobSegname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocationSpecifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LocationSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_locationSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterLocationSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitLocationSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitLocationSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocationSpecifierContext locationSpecifier() throws RecognitionException {
		LocationSpecifierContext _localctx = new LocationSpecifierContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_locationSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class XmlSchemaURLNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public XmlSchemaURLNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xmlSchemaURLName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterXmlSchemaURLName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitXmlSchemaURLName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitXmlSchemaURLName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XmlSchemaURLNameContext xmlSchemaURLName() throws RecognitionException {
		XmlSchemaURLNameContext _localctx = new XmlSchemaURLNameContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_xmlSchemaURLName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ElementNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterElementName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitElementName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitElementName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementNameContext elementName() throws RecognitionException {
		ElementNameContext _localctx = new ElementNameContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_elementName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubpartitionNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SubpartitionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subpartitionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterSubpartitionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitSubpartitionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitSubpartitionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubpartitionNameContext subpartitionName() throws RecognitionException {
		SubpartitionNameContext _localctx = new SubpartitionNameContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_subpartitionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ParameterNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterParameterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitParameterName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitParameterName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterNameContext parameterName() throws RecognitionException {
		ParameterNameContext _localctx = new ParameterNameContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_parameterName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EditionNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EditionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_editionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterEditionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitEditionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitEditionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EditionNameContext editionName() throws RecognitionException {
		EditionNameContext _localctx = new EditionNameContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_editionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContainerNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ContainerNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_containerName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterContainerName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitContainerName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitContainerName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContainerNameContext containerName() throws RecognitionException {
		ContainerNameContext _localctx = new ContainerNameContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_containerName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PartitionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterPartitionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitPartitionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitPartitionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionNameContext partitionName() throws RecognitionException {
		PartitionNameContext _localctx = new PartitionNameContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_partitionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionSetNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PartitionSetNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionSetName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterPartitionSetName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitPartitionSetName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitPartitionSetName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionSetNameContext partitionSetName() throws RecognitionException {
		PartitionSetNameContext _localctx = new PartitionSetNameContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_partitionSetName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionKeyValueContext extends ParserRuleContext {
		public TerminalNode INTEGER_() { return getToken(BaseRuleParser.INTEGER_, 0); }
		public DateTimeLiteralsContext dateTimeLiterals() {
			return getRuleContext(DateTimeLiteralsContext.class,0);
		}
		public PartitionKeyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionKeyValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterPartitionKeyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitPartitionKeyValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitPartitionKeyValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionKeyValueContext partitionKeyValue() throws RecognitionException {
		PartitionKeyValueContext _localctx = new PartitionKeyValueContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_partitionKeyValue);
		try {
			setState(551);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(549);
				match(INTEGER_);
				}
				break;
			case LBE_:
			case DATE:
			case TIME:
			case TIMESTAMP:
				enterOuterAlt(_localctx, 2);
				{
				setState(550);
				dateTimeLiterals();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubpartitionKeyValueContext extends ParserRuleContext {
		public TerminalNode INTEGER_() { return getToken(BaseRuleParser.INTEGER_, 0); }
		public DateTimeLiteralsContext dateTimeLiterals() {
			return getRuleContext(DateTimeLiteralsContext.class,0);
		}
		public SubpartitionKeyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subpartitionKeyValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterSubpartitionKeyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitSubpartitionKeyValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitSubpartitionKeyValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubpartitionKeyValueContext subpartitionKeyValue() throws RecognitionException {
		SubpartitionKeyValueContext _localctx = new SubpartitionKeyValueContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_subpartitionKeyValue);
		try {
			setState(555);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(553);
				match(INTEGER_);
				}
				break;
			case LBE_:
			case DATE:
			case TIME:
			case TIMESTAMP:
				enterOuterAlt(_localctx, 2);
				{
				setState(554);
				dateTimeLiterals();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ZonemapNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ZonemapNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zonemapName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterZonemapName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitZonemapName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitZonemapName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ZonemapNameContext zonemapName() throws RecognitionException {
		ZonemapNameContext _localctx = new ZonemapNameContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_zonemapName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FlashbackArchiveNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FlashbackArchiveNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flashbackArchiveName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterFlashbackArchiveName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitFlashbackArchiveName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitFlashbackArchiveName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FlashbackArchiveNameContext flashbackArchiveName() throws RecognitionException {
		FlashbackArchiveNameContext _localctx = new FlashbackArchiveNameContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_flashbackArchiveName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RoleNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public RoleNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_roleName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterRoleName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitRoleName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitRoleName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoleNameContext roleName() throws RecognitionException {
		RoleNameContext _localctx = new RoleNameContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_roleName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UserNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public UserNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterUserName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitUserName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitUserName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UserNameContext userName() throws RecognitionException {
		UserNameContext _localctx = new UserNameContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_userName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PasswordContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PasswordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_password; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterPassword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitPassword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitPassword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PasswordContext password() throws RecognitionException {
		PasswordContext _localctx = new PasswordContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_password);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogGroupNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LogGroupNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logGroupName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterLogGroupName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitLogGroupName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitLogGroupName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogGroupNameContext logGroupName() throws RecognitionException {
		LogGroupNameContext _localctx = new LogGroupNameContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_logGroupName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnNamesContext extends ParserRuleContext {
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public TerminalNode LP_() { return getToken(BaseRuleParser.LP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(BaseRuleParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(BaseRuleParser.COMMA_, i);
		}
		public TerminalNode RP_() { return getToken(BaseRuleParser.RP_, 0); }
		public ColumnNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNames; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterColumnNames(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitColumnNames(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitColumnNames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNamesContext columnNames() throws RecognitionException {
		ColumnNamesContext _localctx = new ColumnNamesContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_columnNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(569);
				match(LP_);
				}
			}

			setState(572);
			columnName();
			setState(577);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(573);
				match(COMMA_);
				setState(574);
				columnName();
				}
				}
				setState(579);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(581);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RP_) {
				{
				setState(580);
				match(RP_);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableNamesContext extends ParserRuleContext {
		public List<TableNameContext> tableName() {
			return getRuleContexts(TableNameContext.class);
		}
		public TableNameContext tableName(int i) {
			return getRuleContext(TableNameContext.class,i);
		}
		public TerminalNode LP_() { return getToken(BaseRuleParser.LP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(BaseRuleParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(BaseRuleParser.COMMA_, i);
		}
		public TerminalNode RP_() { return getToken(BaseRuleParser.RP_, 0); }
		public TableNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableNames; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterTableNames(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitTableNames(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitTableNames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableNamesContext tableNames() throws RecognitionException {
		TableNamesContext _localctx = new TableNamesContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_tableNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(583);
				match(LP_);
				}
			}

			setState(586);
			tableName();
			setState(591);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(587);
				match(COMMA_);
				setState(588);
				tableName();
				}
				}
				setState(593);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(595);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RP_) {
				{
				setState(594);
				match(RP_);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OracleIdContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> STRING_() { return getTokens(BaseRuleParser.STRING_); }
		public TerminalNode STRING_(int i) {
			return getToken(BaseRuleParser.STRING_, i);
		}
		public List<TerminalNode> DOT_() { return getTokens(BaseRuleParser.DOT_); }
		public TerminalNode DOT_(int i) {
			return getToken(BaseRuleParser.DOT_, i);
		}
		public OracleIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oracleId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterOracleId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitOracleId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitOracleId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OracleIdContext oracleId() throws RecognitionException {
		OracleIdContext _localctx = new OracleIdContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_oracleId);
		try {
			int _alt;
			setState(606);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUNCATE:
			case SCHEMA:
			case FUNCTION:
			case PROCEDURE:
			case CASE:
			case WHEN:
			case CAST:
			case TRIM:
			case SUBSTRING:
			case NATURAL:
			case JOIN:
			case FULL:
			case INNER:
			case OUTER:
			case LEFT:
			case RIGHT:
			case CROSS:
			case USING:
			case IF:
			case TRUE:
			case FALSE:
			case LIMIT:
			case OFFSET:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case BOOLEAN:
			case DOUBLE:
			case CHARACTER:
			case ARRAY:
			case INTERVAL:
			case TIME:
			case TIMESTAMP:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case YEAR:
			case QUARTER:
			case MONTH:
			case WEEK:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case MICROSECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case ENABLE:
			case DISABLE:
			case PRESERVE:
			case DO:
			case DEFINER:
			case CURRENT_USER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case COLLATION:
			case NAMES:
			case REAL:
			case TYPE:
			case BINARY:
			case ESCAPE:
			case MOD:
			case XOR:
			case UNKNOWN:
			case ALWAYS:
			case CASCADE:
			case GENERATED:
			case PRIVILEGES:
			case READ:
			case WRITE:
			case REFERENCES:
			case TRANSACTION:
			case ROLE:
			case VISIBLE:
			case INVISIBLE:
			case EXECUTE:
			case USE:
			case DEBUG:
			case UNDER:
			case FLASHBACK:
			case ARCHIVE:
			case REFRESH:
			case QUERY:
			case REWRITE:
			case KEEP:
			case SEQUENCE:
			case INHERIT:
			case TRANSLATE:
			case MERGE:
			case AT:
			case BITMAP:
			case CACHE:
			case NOCACHE:
			case CHECKPOINT:
			case CONSTRAINTS:
			case CYCLE:
			case NOCYCLE:
			case DBTIMEZONE:
			case ENCRYPT:
			case DECRYPT:
			case DEFERRABLE:
			case DEFERRED:
			case EDITION:
			case ELEMENT:
			case END:
			case EXCEPTIONS:
			case FORCE:
			case GLOBAL:
			case IDENTITY:
			case INITIALLY:
			case INVALIDATE:
			case JAVA:
			case LEVELS:
			case MAXVALUE:
			case MINVALUE:
			case NOMAXVALUE:
			case NOMINVALUE:
			case MINING:
			case MODEL:
			case NATIONAL:
			case NEW:
			case NOORDER:
			case NORELY:
			case ONLY:
			case PROFILE:
			case REF:
			case REKEY:
			case RELY:
			case REPLACE:
			case SALT:
			case SCOPE:
			case SORT:
			case SOURCE:
			case SUBSTITUTABLE:
			case TABLESPACE:
			case TEMPORARY:
			case TRANSLATION:
			case TREAT:
			case NO:
			case UNUSED:
			case NOVALIDATE:
			case VALUE:
			case VARYING:
			case VIRTUAL:
			case ZONE:
			case ADVISOR:
			case ADMINISTER:
			case TUNING:
			case MANAGE:
			case MANAGEMENT:
			case OBJECT:
			case CONTEXT:
			case EXEMPT:
			case REDACTION:
			case POLICY:
			case DATABASE:
			case SYSTEM:
			case LINK:
			case ANALYZE:
			case DICTIONARY:
			case DIMENSION:
			case INDEXTYPE:
			case EXTERNAL:
			case JOB:
			case CLASS:
			case PROGRAM:
			case SCHEDULER:
			case LIBRARY:
			case LOGMINING:
			case MATERIALIZED:
			case CUBE:
			case MEASURE:
			case FOLDER:
			case BUILD:
			case PROCESS:
			case OPERATOR:
			case OUTLINE:
			case PLUGGABLE:
			case CONTAINER:
			case SEGMENT:
			case RESTRICTED:
			case COST:
			case BACKUP:
			case UNLIMITED:
			case BECOME:
			case CHANGE:
			case NOTIFICATION:
			case PRIVILEGE:
			case PURGE:
			case RESUMABLE:
			case SYSGUID:
			case SYSBACKUP:
			case SYSDBA:
			case SYSDG:
			case SYSKM:
			case SYSOPER:
			case DBA_RECYCLEBIN:
			case FIRST:
			case RANK:
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(597);
				identifier();
				}
				break;
			case STRING_:
				enterOuterAlt(_localctx, 2);
				{
				setState(602);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(598);
						match(STRING_);
						setState(599);
						match(DOT_);
						}
						} 
					}
					setState(604);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				setState(605);
				match(STRING_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CollationNameContext extends ParserRuleContext {
		public TerminalNode STRING_() { return getToken(BaseRuleParser.STRING_, 0); }
		public TerminalNode IDENTIFIER_() { return getToken(BaseRuleParser.IDENTIFIER_, 0); }
		public CollationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collationName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterCollationName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitCollationName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitCollationName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CollationNameContext collationName() throws RecognitionException {
		CollationNameContext _localctx = new CollationNameContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_collationName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(608);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER_ || _la==STRING_) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnCollationNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnCollationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnCollationName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterColumnCollationName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitColumnCollationName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitColumnCollationName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnCollationNameContext columnCollationName() throws RecognitionException {
		ColumnCollationNameContext _localctx = new ColumnCollationNameContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_columnCollationName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AliasContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING_() { return getToken(BaseRuleParser.STRING_, 0); }
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_alias);
		try {
			setState(614);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUNCATE:
			case SCHEMA:
			case FUNCTION:
			case PROCEDURE:
			case CASE:
			case WHEN:
			case CAST:
			case TRIM:
			case SUBSTRING:
			case NATURAL:
			case JOIN:
			case FULL:
			case INNER:
			case OUTER:
			case LEFT:
			case RIGHT:
			case CROSS:
			case USING:
			case IF:
			case TRUE:
			case FALSE:
			case LIMIT:
			case OFFSET:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case BOOLEAN:
			case DOUBLE:
			case CHARACTER:
			case ARRAY:
			case INTERVAL:
			case TIME:
			case TIMESTAMP:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case YEAR:
			case QUARTER:
			case MONTH:
			case WEEK:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case MICROSECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case ENABLE:
			case DISABLE:
			case PRESERVE:
			case DO:
			case DEFINER:
			case CURRENT_USER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case COLLATION:
			case NAMES:
			case REAL:
			case TYPE:
			case BINARY:
			case ESCAPE:
			case MOD:
			case XOR:
			case UNKNOWN:
			case ALWAYS:
			case CASCADE:
			case GENERATED:
			case PRIVILEGES:
			case READ:
			case WRITE:
			case REFERENCES:
			case TRANSACTION:
			case ROLE:
			case VISIBLE:
			case INVISIBLE:
			case EXECUTE:
			case USE:
			case DEBUG:
			case UNDER:
			case FLASHBACK:
			case ARCHIVE:
			case REFRESH:
			case QUERY:
			case REWRITE:
			case KEEP:
			case SEQUENCE:
			case INHERIT:
			case TRANSLATE:
			case MERGE:
			case AT:
			case BITMAP:
			case CACHE:
			case NOCACHE:
			case CHECKPOINT:
			case CONSTRAINTS:
			case CYCLE:
			case NOCYCLE:
			case DBTIMEZONE:
			case ENCRYPT:
			case DECRYPT:
			case DEFERRABLE:
			case DEFERRED:
			case EDITION:
			case ELEMENT:
			case END:
			case EXCEPTIONS:
			case FORCE:
			case GLOBAL:
			case IDENTITY:
			case INITIALLY:
			case INVALIDATE:
			case JAVA:
			case LEVELS:
			case MAXVALUE:
			case MINVALUE:
			case NOMAXVALUE:
			case NOMINVALUE:
			case MINING:
			case MODEL:
			case NATIONAL:
			case NEW:
			case NOORDER:
			case NORELY:
			case ONLY:
			case PROFILE:
			case REF:
			case REKEY:
			case RELY:
			case REPLACE:
			case SALT:
			case SCOPE:
			case SORT:
			case SOURCE:
			case SUBSTITUTABLE:
			case TABLESPACE:
			case TEMPORARY:
			case TRANSLATION:
			case TREAT:
			case NO:
			case UNUSED:
			case NOVALIDATE:
			case VALUE:
			case VARYING:
			case VIRTUAL:
			case ZONE:
			case ADVISOR:
			case ADMINISTER:
			case TUNING:
			case MANAGE:
			case MANAGEMENT:
			case OBJECT:
			case CONTEXT:
			case EXEMPT:
			case REDACTION:
			case POLICY:
			case DATABASE:
			case SYSTEM:
			case LINK:
			case ANALYZE:
			case DICTIONARY:
			case DIMENSION:
			case INDEXTYPE:
			case EXTERNAL:
			case JOB:
			case CLASS:
			case PROGRAM:
			case SCHEDULER:
			case LIBRARY:
			case LOGMINING:
			case MATERIALIZED:
			case CUBE:
			case MEASURE:
			case FOLDER:
			case BUILD:
			case PROCESS:
			case OPERATOR:
			case OUTLINE:
			case PLUGGABLE:
			case CONTAINER:
			case SEGMENT:
			case RESTRICTED:
			case COST:
			case BACKUP:
			case UNLIMITED:
			case BECOME:
			case CHANGE:
			case NOTIFICATION:
			case PRIVILEGE:
			case PURGE:
			case RESUMABLE:
			case SYSGUID:
			case SYSBACKUP:
			case SYSDBA:
			case SYSDG:
			case SYSKM:
			case SYSOPER:
			case DBA_RECYCLEBIN:
			case FIRST:
			case RANK:
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(612);
				identifier();
				}
				break;
			case STRING_:
				enterOuterAlt(_localctx, 2);
				{
				setState(613);
				match(STRING_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeLengthContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(BaseRuleParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(BaseRuleParser.RP_, 0); }
		public List<TerminalNode> INTEGER_() { return getTokens(BaseRuleParser.INTEGER_); }
		public TerminalNode INTEGER_(int i) {
			return getToken(BaseRuleParser.INTEGER_, i);
		}
		public TerminalNode COMMA_() { return getToken(BaseRuleParser.COMMA_, 0); }
		public DataTypeLengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypeLength; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterDataTypeLength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitDataTypeLength(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitDataTypeLength(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeLengthContext dataTypeLength() throws RecognitionException {
		DataTypeLengthContext _localctx = new DataTypeLengthContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_dataTypeLength);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			match(LP_);
			setState(622);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTEGER_) {
				{
				setState(617);
				match(INTEGER_);
				setState(620);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA_) {
					{
					setState(618);
					match(COMMA_);
					setState(619);
					match(INTEGER_);
					}
				}

				}
			}

			setState(624);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryKeyContext extends ParserRuleContext {
		public TerminalNode KEY() { return getToken(BaseRuleParser.KEY, 0); }
		public TerminalNode PRIMARY() { return getToken(BaseRuleParser.PRIMARY, 0); }
		public PrimaryKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterPrimaryKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitPrimaryKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitPrimaryKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryKeyContext primaryKey() throws RecognitionException {
		PrimaryKeyContext _localctx = new PrimaryKeyContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_primaryKey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(627);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIMARY) {
				{
				setState(626);
				match(PRIMARY);
				}
			}

			setState(629);
			match(KEY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(BaseRuleParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(BaseRuleParser.COMMA_, i);
		}
		public ExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterExprs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitExprs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitExprs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprsContext exprs() throws RecognitionException {
		ExprsContext _localctx = new ExprsContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_exprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			expr(0);
			setState(636);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(632);
				match(COMMA_);
				setState(633);
				expr(0);
				}
				}
				setState(638);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprListContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(BaseRuleParser.LP_, 0); }
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public TerminalNode RP_() { return getToken(BaseRuleParser.RP_, 0); }
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitExprList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_exprList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
			match(LP_);
			setState(640);
			exprs();
			setState(641);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public NotOperatorContext notOperator() {
			return getRuleContext(NotOperatorContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LP_() { return getToken(BaseRuleParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(BaseRuleParser.RP_, 0); }
		public BooleanPrimaryContext booleanPrimary() {
			return getRuleContext(BooleanPrimaryContext.class,0);
		}
		public LogicalOperatorContext logicalOperator() {
			return getRuleContext(LogicalOperatorContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 146;
		enterRecursionRule(_localctx, 146, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(652);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(644);
				notOperator();
				setState(645);
				expr(3);
				}
				break;
			case 2:
				{
				setState(647);
				match(LP_);
				setState(648);
				expr(0);
				setState(649);
				match(RP_);
				}
				break;
			case 3:
				{
				setState(651);
				booleanPrimary(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(660);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(654);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(655);
					logicalOperator();
					setState(656);
					expr(5);
					}
					} 
				}
				setState(662);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LogicalOperatorContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(BaseRuleParser.OR, 0); }
		public TerminalNode OR_() { return getToken(BaseRuleParser.OR_, 0); }
		public TerminalNode AND() { return getToken(BaseRuleParser.AND, 0); }
		public TerminalNode AND_() { return getToken(BaseRuleParser.AND_, 0); }
		public LogicalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterLogicalOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitLogicalOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitLogicalOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOperatorContext logicalOperator() throws RecognitionException {
		LogicalOperatorContext _localctx = new LogicalOperatorContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_logicalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(663);
			_la = _input.LA(1);
			if ( !(_la==AND_ || _la==OR_ || _la==AND || _la==OR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotOperatorContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(BaseRuleParser.NOT, 0); }
		public TerminalNode NOT_() { return getToken(BaseRuleParser.NOT_, 0); }
		public NotOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterNotOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitNotOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitNotOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotOperatorContext notOperator() throws RecognitionException {
		NotOperatorContext _localctx = new NotOperatorContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_notOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			_la = _input.LA(1);
			if ( !(_la==NOT_ || _la==NOT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanPrimaryContext extends ParserRuleContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public BooleanPrimaryContext booleanPrimary() {
			return getRuleContext(BooleanPrimaryContext.class,0);
		}
		public TerminalNode IS() { return getToken(BaseRuleParser.IS, 0); }
		public TerminalNode TRUE() { return getToken(BaseRuleParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(BaseRuleParser.FALSE, 0); }
		public TerminalNode UNKNOWN() { return getToken(BaseRuleParser.UNKNOWN, 0); }
		public TerminalNode NULL() { return getToken(BaseRuleParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(BaseRuleParser.NOT, 0); }
		public TerminalNode SAFE_EQ_() { return getToken(BaseRuleParser.SAFE_EQ_, 0); }
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode ALL() { return getToken(BaseRuleParser.ALL, 0); }
		public TerminalNode ANY() { return getToken(BaseRuleParser.ANY, 0); }
		public BooleanPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanPrimary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterBooleanPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitBooleanPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitBooleanPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanPrimaryContext booleanPrimary() throws RecognitionException {
		return booleanPrimary(0);
	}

	private BooleanPrimaryContext booleanPrimary(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanPrimaryContext _localctx = new BooleanPrimaryContext(_ctx, _parentState);
		BooleanPrimaryContext _prevctx = _localctx;
		int _startState = 152;
		enterRecursionRule(_localctx, 152, RULE_booleanPrimary, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(668);
			predicate();
			}
			_ctx.stop = _input.LT(-1);
			setState(690);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(688);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
					case 1:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(670);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(671);
						match(IS);
						setState(673);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(672);
							match(NOT);
							}
						}

						setState(675);
						_la = _input.LA(1);
						if ( !(((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (NULL - 103)) | (1L << (TRUE - 103)) | (1L << (FALSE - 103)))) != 0) || _la==UNKNOWN) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 2:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(676);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(677);
						match(SAFE_EQ_);
						setState(678);
						predicate();
						}
						break;
					case 3:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(679);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(680);
						comparisonOperator();
						setState(681);
						predicate();
						}
						break;
					case 4:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(683);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(684);
						comparisonOperator();
						setState(685);
						_la = _input.LA(1);
						if ( !(_la==ALL || _la==ANY) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(686);
						subquery();
						}
						break;
					}
					} 
				}
				setState(692);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQ_() { return getToken(BaseRuleParser.EQ_, 0); }
		public TerminalNode GTE_() { return getToken(BaseRuleParser.GTE_, 0); }
		public TerminalNode GT_() { return getToken(BaseRuleParser.GT_, 0); }
		public TerminalNode LTE_() { return getToken(BaseRuleParser.LTE_, 0); }
		public TerminalNode LT_() { return getToken(BaseRuleParser.LT_, 0); }
		public TerminalNode NEQ_() { return getToken(BaseRuleParser.NEQ_, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ_) | (1L << NEQ_) | (1L << GT_) | (1L << GTE_) | (1L << LT_) | (1L << LTE_))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateContext extends ParserRuleContext {
		public List<BitExprContext> bitExpr() {
			return getRuleContexts(BitExprContext.class);
		}
		public BitExprContext bitExpr(int i) {
			return getRuleContext(BitExprContext.class,i);
		}
		public TerminalNode IN() { return getToken(BaseRuleParser.IN, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode NOT() { return getToken(BaseRuleParser.NOT, 0); }
		public TerminalNode LP_() { return getToken(BaseRuleParser.LP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP_() { return getToken(BaseRuleParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(BaseRuleParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(BaseRuleParser.COMMA_, i);
		}
		public TerminalNode AND() { return getToken(BaseRuleParser.AND, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode BETWEEN() { return getToken(BaseRuleParser.BETWEEN, 0); }
		public TerminalNode LIKE() { return getToken(BaseRuleParser.LIKE, 0); }
		public List<SimpleExprContext> simpleExpr() {
			return getRuleContexts(SimpleExprContext.class);
		}
		public SimpleExprContext simpleExpr(int i) {
			return getRuleContext(SimpleExprContext.class,i);
		}
		public TerminalNode ESCAPE() { return getToken(BaseRuleParser.ESCAPE, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_predicate);
		int _la;
		try {
			setState(756);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(695);
				bitExpr(0);
				setState(697);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(696);
					match(NOT);
					}
				}

				setState(699);
				match(IN);
				setState(700);
				subquery();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(702);
				bitExpr(0);
				setState(704);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(703);
					match(NOT);
					}
				}

				setState(706);
				match(IN);
				setState(707);
				match(LP_);
				setState(708);
				expr(0);
				setState(713);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(709);
					match(COMMA_);
					setState(710);
					expr(0);
					}
					}
					setState(715);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(716);
				match(RP_);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(718);
				bitExpr(0);
				setState(720);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(719);
					match(NOT);
					}
				}

				setState(722);
				match(IN);
				setState(723);
				match(LP_);
				setState(724);
				expr(0);
				setState(729);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(725);
					match(COMMA_);
					setState(726);
					expr(0);
					}
					}
					setState(731);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(732);
				match(RP_);
				setState(733);
				match(AND);
				setState(734);
				predicate();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(736);
				bitExpr(0);
				setState(738);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(737);
					match(NOT);
					}
				}

				setState(740);
				match(BETWEEN);
				setState(741);
				bitExpr(0);
				setState(742);
				match(AND);
				setState(743);
				predicate();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(745);
				bitExpr(0);
				setState(747);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(746);
					match(NOT);
					}
				}

				setState(749);
				match(LIKE);
				setState(750);
				simpleExpr(0);
				setState(753);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(751);
					match(ESCAPE);
					setState(752);
					simpleExpr(0);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(755);
				bitExpr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BitExprContext extends ParserRuleContext {
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public List<BitExprContext> bitExpr() {
			return getRuleContexts(BitExprContext.class);
		}
		public BitExprContext bitExpr(int i) {
			return getRuleContext(BitExprContext.class,i);
		}
		public TerminalNode VERTICAL_BAR_() { return getToken(BaseRuleParser.VERTICAL_BAR_, 0); }
		public TerminalNode AMPERSAND_() { return getToken(BaseRuleParser.AMPERSAND_, 0); }
		public TerminalNode SIGNED_LEFT_SHIFT_() { return getToken(BaseRuleParser.SIGNED_LEFT_SHIFT_, 0); }
		public TerminalNode SIGNED_RIGHT_SHIFT_() { return getToken(BaseRuleParser.SIGNED_RIGHT_SHIFT_, 0); }
		public TerminalNode PLUS_() { return getToken(BaseRuleParser.PLUS_, 0); }
		public TerminalNode MINUS_() { return getToken(BaseRuleParser.MINUS_, 0); }
		public TerminalNode ASTERISK_() { return getToken(BaseRuleParser.ASTERISK_, 0); }
		public TerminalNode SLASH_() { return getToken(BaseRuleParser.SLASH_, 0); }
		public TerminalNode MOD_() { return getToken(BaseRuleParser.MOD_, 0); }
		public TerminalNode CARET_() { return getToken(BaseRuleParser.CARET_, 0); }
		public BitExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterBitExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitBitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitBitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BitExprContext bitExpr() throws RecognitionException {
		return bitExpr(0);
	}

	private BitExprContext bitExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BitExprContext _localctx = new BitExprContext(_ctx, _parentState);
		BitExprContext _prevctx = _localctx;
		int _startState = 158;
		enterRecursionRule(_localctx, 158, RULE_bitExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(759);
			simpleExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(793);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(791);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
					case 1:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(761);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(762);
						match(VERTICAL_BAR_);
						setState(763);
						bitExpr(12);
						}
						break;
					case 2:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(764);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(765);
						match(AMPERSAND_);
						setState(766);
						bitExpr(11);
						}
						break;
					case 3:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(767);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(768);
						match(SIGNED_LEFT_SHIFT_);
						setState(769);
						bitExpr(10);
						}
						break;
					case 4:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(770);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(771);
						match(SIGNED_RIGHT_SHIFT_);
						setState(772);
						bitExpr(9);
						}
						break;
					case 5:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(773);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(774);
						match(PLUS_);
						setState(775);
						bitExpr(8);
						}
						break;
					case 6:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(776);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(777);
						match(MINUS_);
						setState(778);
						bitExpr(7);
						}
						break;
					case 7:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(779);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(780);
						match(ASTERISK_);
						setState(781);
						bitExpr(6);
						}
						break;
					case 8:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(782);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(783);
						match(SLASH_);
						setState(784);
						bitExpr(5);
						}
						break;
					case 9:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(785);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(786);
						match(MOD_);
						setState(787);
						bitExpr(4);
						}
						break;
					case 10:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(788);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(789);
						match(CARET_);
						setState(790);
						bitExpr(3);
						}
						break;
					}
					} 
				}
				setState(795);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SimpleExprContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ParameterMarkerContext parameterMarker() {
			return getRuleContext(ParameterMarkerContext.class,0);
		}
		public LiteralsContext literals() {
			return getRuleContext(LiteralsContext.class,0);
		}
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public List<SimpleExprContext> simpleExpr() {
			return getRuleContexts(SimpleExprContext.class);
		}
		public SimpleExprContext simpleExpr(int i) {
			return getRuleContext(SimpleExprContext.class,i);
		}
		public TerminalNode PLUS_() { return getToken(BaseRuleParser.PLUS_, 0); }
		public TerminalNode MINUS_() { return getToken(BaseRuleParser.MINUS_, 0); }
		public TerminalNode TILDE_() { return getToken(BaseRuleParser.TILDE_, 0); }
		public TerminalNode NOT_() { return getToken(BaseRuleParser.NOT_, 0); }
		public TerminalNode BINARY() { return getToken(BaseRuleParser.BINARY, 0); }
		public TerminalNode LP_() { return getToken(BaseRuleParser.LP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP_() { return getToken(BaseRuleParser.RP_, 0); }
		public TerminalNode ROW() { return getToken(BaseRuleParser.ROW, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(BaseRuleParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(BaseRuleParser.COMMA_, i);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode EXISTS() { return getToken(BaseRuleParser.EXISTS, 0); }
		public TerminalNode LBE_() { return getToken(BaseRuleParser.LBE_, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RBE_() { return getToken(BaseRuleParser.RBE_, 0); }
		public CaseExpressionContext caseExpression() {
			return getRuleContext(CaseExpressionContext.class,0);
		}
		public PrivateExprOfDbContext privateExprOfDb() {
			return getRuleContext(PrivateExprOfDbContext.class,0);
		}
		public TerminalNode OR_() { return getToken(BaseRuleParser.OR_, 0); }
		public SimpleExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterSimpleExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitSimpleExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitSimpleExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleExprContext simpleExpr() throws RecognitionException {
		return simpleExpr(0);
	}

	private SimpleExprContext simpleExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SimpleExprContext _localctx = new SimpleExprContext(_ctx, _parentState);
		SimpleExprContext _prevctx = _localctx;
		int _startState = 160;
		enterRecursionRule(_localctx, 160, RULE_simpleExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(828);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(797);
				functionCall();
				}
				break;
			case 2:
				{
				setState(798);
				parameterMarker();
				}
				break;
			case 3:
				{
				setState(799);
				literals();
				}
				break;
			case 4:
				{
				setState(800);
				columnName();
				}
				break;
			case 5:
				{
				setState(801);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT_) | (1L << TILDE_) | (1L << PLUS_) | (1L << MINUS_))) != 0) || _la==BINARY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(802);
				simpleExpr(6);
				}
				break;
			case 6:
				{
				setState(804);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROW) {
					{
					setState(803);
					match(ROW);
					}
				}

				setState(806);
				match(LP_);
				setState(807);
				expr(0);
				setState(812);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(808);
					match(COMMA_);
					setState(809);
					expr(0);
					}
					}
					setState(814);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(815);
				match(RP_);
				}
				break;
			case 7:
				{
				setState(818);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXISTS) {
					{
					setState(817);
					match(EXISTS);
					}
				}

				setState(820);
				subquery();
				}
				break;
			case 8:
				{
				setState(821);
				match(LBE_);
				setState(822);
				identifier();
				setState(823);
				expr(0);
				setState(824);
				match(RBE_);
				}
				break;
			case 9:
				{
				setState(826);
				caseExpression();
				}
				break;
			case 10:
				{
				setState(827);
				privateExprOfDb();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(835);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SimpleExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_simpleExpr);
					setState(830);
					if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
					setState(831);
					match(OR_);
					setState(832);
					simpleExpr(8);
					}
					} 
				}
				setState(837);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public AggregationFunctionContext aggregationFunction() {
			return getRuleContext(AggregationFunctionContext.class,0);
		}
		public SpecialFunctionContext specialFunction() {
			return getRuleContext(SpecialFunctionContext.class,0);
		}
		public RegularFunctionContext regularFunction() {
			return getRuleContext(RegularFunctionContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_functionCall);
		try {
			setState(841);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(838);
				aggregationFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(839);
				specialFunction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(840);
				regularFunction();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AggregationFunctionContext extends ParserRuleContext {
		public AggregationFunctionNameContext aggregationFunctionName() {
			return getRuleContext(AggregationFunctionNameContext.class,0);
		}
		public TerminalNode LP_() { return getToken(BaseRuleParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(BaseRuleParser.RP_, 0); }
		public DistinctContext distinct() {
			return getRuleContext(DistinctContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ASTERISK_() { return getToken(BaseRuleParser.ASTERISK_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(BaseRuleParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(BaseRuleParser.COMMA_, i);
		}
		public AggregationFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregationFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterAggregationFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitAggregationFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitAggregationFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregationFunctionContext aggregationFunction() throws RecognitionException {
		AggregationFunctionContext _localctx = new AggregationFunctionContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_aggregationFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(843);
			aggregationFunctionName();
			setState(844);
			match(LP_);
			setState(846);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(845);
				distinct();
				}
			}

			setState(857);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case NOT_:
			case TILDE_:
			case PLUS_:
			case MINUS_:
			case LP_:
			case LBE_:
			case QUESTION_:
			case TRUNCATE:
			case SCHEMA:
			case FUNCTION:
			case PROCEDURE:
			case CASE:
			case WHEN:
			case CAST:
			case TRIM:
			case SUBSTRING:
			case NATURAL:
			case JOIN:
			case FULL:
			case INNER:
			case OUTER:
			case LEFT:
			case RIGHT:
			case CROSS:
			case USING:
			case IF:
			case NOT:
			case NULL:
			case TRUE:
			case FALSE:
			case EXISTS:
			case LIMIT:
			case OFFSET:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case BOOLEAN:
			case DOUBLE:
			case CHAR:
			case CHARACTER:
			case ARRAY:
			case INTERVAL:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case YEAR:
			case QUARTER:
			case MONTH:
			case WEEK:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case MICROSECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case ENABLE:
			case DISABLE:
			case PRESERVE:
			case DO:
			case DEFINER:
			case CURRENT_USER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case COLLATION:
			case NAMES:
			case REAL:
			case TYPE:
			case BINARY:
			case ESCAPE:
			case MOD:
			case XOR:
			case ROW:
			case UNKNOWN:
			case ALWAYS:
			case CASCADE:
			case GENERATED:
			case PRIVILEGES:
			case READ:
			case WRITE:
			case REFERENCES:
			case TRANSACTION:
			case ROLE:
			case VISIBLE:
			case INVISIBLE:
			case EXECUTE:
			case USE:
			case DEBUG:
			case UNDER:
			case FLASHBACK:
			case ARCHIVE:
			case REFRESH:
			case QUERY:
			case REWRITE:
			case KEEP:
			case SEQUENCE:
			case INHERIT:
			case TRANSLATE:
			case MERGE:
			case AT:
			case BITMAP:
			case CACHE:
			case NOCACHE:
			case CHECKPOINT:
			case CONSTRAINTS:
			case CYCLE:
			case NOCYCLE:
			case DBTIMEZONE:
			case ENCRYPT:
			case DECRYPT:
			case DEFERRABLE:
			case DEFERRED:
			case EDITION:
			case ELEMENT:
			case END:
			case EXCEPTIONS:
			case FORCE:
			case GLOBAL:
			case IDENTITY:
			case INITIALLY:
			case INVALIDATE:
			case JAVA:
			case LEVELS:
			case MAXVALUE:
			case MINVALUE:
			case NOMAXVALUE:
			case NOMINVALUE:
			case MINING:
			case MODEL:
			case NATIONAL:
			case NEW:
			case NOORDER:
			case NORELY:
			case ONLY:
			case PROFILE:
			case REF:
			case REKEY:
			case RELY:
			case REPLACE:
			case SALT:
			case SCOPE:
			case SORT:
			case SOURCE:
			case SUBSTITUTABLE:
			case TABLESPACE:
			case TEMPORARY:
			case TRANSLATION:
			case TREAT:
			case NO:
			case UNUSED:
			case NOVALIDATE:
			case VALUE:
			case VARYING:
			case VIRTUAL:
			case ZONE:
			case ADVISOR:
			case ADMINISTER:
			case TUNING:
			case MANAGE:
			case MANAGEMENT:
			case OBJECT:
			case CONTEXT:
			case EXEMPT:
			case REDACTION:
			case POLICY:
			case DATABASE:
			case SYSTEM:
			case LINK:
			case ANALYZE:
			case DICTIONARY:
			case DIMENSION:
			case INDEXTYPE:
			case EXTERNAL:
			case JOB:
			case CLASS:
			case PROGRAM:
			case SCHEDULER:
			case LIBRARY:
			case LOGMINING:
			case MATERIALIZED:
			case CUBE:
			case MEASURE:
			case FOLDER:
			case BUILD:
			case PROCESS:
			case OPERATOR:
			case OUTLINE:
			case PLUGGABLE:
			case CONTAINER:
			case SEGMENT:
			case RESTRICTED:
			case COST:
			case BACKUP:
			case UNLIMITED:
			case BECOME:
			case CHANGE:
			case NOTIFICATION:
			case PRIVILEGE:
			case PURGE:
			case RESUMABLE:
			case SYSGUID:
			case SYSBACKUP:
			case SYSDBA:
			case SYSDG:
			case SYSKM:
			case SYSOPER:
			case DBA_RECYCLEBIN:
			case FIRST:
			case RANK:
			case IDENTIFIER_:
			case STRING_:
			case INTEGER_:
			case NUMBER_:
			case HEX_DIGIT_:
			case BIT_NUM_:
				{
				setState(848);
				expr(0);
				setState(853);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(849);
					match(COMMA_);
					setState(850);
					expr(0);
					}
					}
					setState(855);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case ASTERISK_:
				{
				setState(856);
				match(ASTERISK_);
				}
				break;
			case RP_:
				break;
			default:
				break;
			}
			setState(859);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AggregationFunctionNameContext extends ParserRuleContext {
		public TerminalNode MAX() { return getToken(BaseRuleParser.MAX, 0); }
		public TerminalNode MIN() { return getToken(BaseRuleParser.MIN, 0); }
		public TerminalNode SUM() { return getToken(BaseRuleParser.SUM, 0); }
		public TerminalNode COUNT() { return getToken(BaseRuleParser.COUNT, 0); }
		public TerminalNode AVG() { return getToken(BaseRuleParser.AVG, 0); }
		public AggregationFunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregationFunctionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterAggregationFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitAggregationFunctionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitAggregationFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregationFunctionNameContext aggregationFunctionName() throws RecognitionException {
		AggregationFunctionNameContext _localctx = new AggregationFunctionNameContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_aggregationFunctionName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(861);
			_la = _input.LA(1);
			if ( !(((((_la - 145)) & ~0x3f) == 0 && ((1L << (_la - 145)) & ((1L << (MAX - 145)) | (1L << (MIN - 145)) | (1L << (SUM - 145)) | (1L << (COUNT - 145)) | (1L << (AVG - 145)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DistinctContext extends ParserRuleContext {
		public TerminalNode DISTINCT() { return getToken(BaseRuleParser.DISTINCT, 0); }
		public DistinctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distinct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterDistinct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitDistinct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitDistinct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DistinctContext distinct() throws RecognitionException {
		DistinctContext _localctx = new DistinctContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_distinct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(863);
			match(DISTINCT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpecialFunctionContext extends ParserRuleContext {
		public CastFunctionContext castFunction() {
			return getRuleContext(CastFunctionContext.class,0);
		}
		public CharFunctionContext charFunction() {
			return getRuleContext(CharFunctionContext.class,0);
		}
		public SpecialFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specialFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterSpecialFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitSpecialFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitSpecialFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecialFunctionContext specialFunction() throws RecognitionException {
		SpecialFunctionContext _localctx = new SpecialFunctionContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_specialFunction);
		try {
			setState(867);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CAST:
				enterOuterAlt(_localctx, 1);
				{
				setState(865);
				castFunction();
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(866);
				charFunction();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastFunctionContext extends ParserRuleContext {
		public TerminalNode CAST() { return getToken(BaseRuleParser.CAST, 0); }
		public TerminalNode LP_() { return getToken(BaseRuleParser.LP_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode AS() { return getToken(BaseRuleParser.AS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode RP_() { return getToken(BaseRuleParser.RP_, 0); }
		public CastFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterCastFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitCastFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitCastFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastFunctionContext castFunction() throws RecognitionException {
		CastFunctionContext _localctx = new CastFunctionContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_castFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(869);
			match(CAST);
			setState(870);
			match(LP_);
			setState(871);
			expr(0);
			setState(872);
			match(AS);
			setState(873);
			dataType();
			setState(874);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharFunctionContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(BaseRuleParser.CHAR, 0); }
		public TerminalNode LP_() { return getToken(BaseRuleParser.LP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP_() { return getToken(BaseRuleParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(BaseRuleParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(BaseRuleParser.COMMA_, i);
		}
		public TerminalNode USING() { return getToken(BaseRuleParser.USING, 0); }
		public IgnoredIdentifierContext ignoredIdentifier() {
			return getRuleContext(IgnoredIdentifierContext.class,0);
		}
		public CharFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterCharFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitCharFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitCharFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharFunctionContext charFunction() throws RecognitionException {
		CharFunctionContext _localctx = new CharFunctionContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_charFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(876);
			match(CHAR);
			setState(877);
			match(LP_);
			setState(878);
			expr(0);
			setState(883);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(879);
				match(COMMA_);
				setState(880);
				expr(0);
				}
				}
				setState(885);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(888);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(886);
				match(USING);
				setState(887);
				ignoredIdentifier();
				}
			}

			setState(890);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RegularFunctionContext extends ParserRuleContext {
		public RegularFunctionNameContext regularFunctionName() {
			return getRuleContext(RegularFunctionNameContext.class,0);
		}
		public TerminalNode LP_() { return getToken(BaseRuleParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(BaseRuleParser.RP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ASTERISK_() { return getToken(BaseRuleParser.ASTERISK_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(BaseRuleParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(BaseRuleParser.COMMA_, i);
		}
		public RegularFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regularFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterRegularFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitRegularFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitRegularFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegularFunctionContext regularFunction() throws RecognitionException {
		RegularFunctionContext _localctx = new RegularFunctionContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_regularFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(892);
			regularFunctionName();
			setState(893);
			match(LP_);
			setState(903);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case NOT_:
			case TILDE_:
			case PLUS_:
			case MINUS_:
			case LP_:
			case LBE_:
			case QUESTION_:
			case TRUNCATE:
			case SCHEMA:
			case FUNCTION:
			case PROCEDURE:
			case CASE:
			case WHEN:
			case CAST:
			case TRIM:
			case SUBSTRING:
			case NATURAL:
			case JOIN:
			case FULL:
			case INNER:
			case OUTER:
			case LEFT:
			case RIGHT:
			case CROSS:
			case USING:
			case IF:
			case NOT:
			case NULL:
			case TRUE:
			case FALSE:
			case EXISTS:
			case LIMIT:
			case OFFSET:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case BOOLEAN:
			case DOUBLE:
			case CHAR:
			case CHARACTER:
			case ARRAY:
			case INTERVAL:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case YEAR:
			case QUARTER:
			case MONTH:
			case WEEK:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case MICROSECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case ENABLE:
			case DISABLE:
			case PRESERVE:
			case DO:
			case DEFINER:
			case CURRENT_USER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case COLLATION:
			case NAMES:
			case REAL:
			case TYPE:
			case BINARY:
			case ESCAPE:
			case MOD:
			case XOR:
			case ROW:
			case UNKNOWN:
			case ALWAYS:
			case CASCADE:
			case GENERATED:
			case PRIVILEGES:
			case READ:
			case WRITE:
			case REFERENCES:
			case TRANSACTION:
			case ROLE:
			case VISIBLE:
			case INVISIBLE:
			case EXECUTE:
			case USE:
			case DEBUG:
			case UNDER:
			case FLASHBACK:
			case ARCHIVE:
			case REFRESH:
			case QUERY:
			case REWRITE:
			case KEEP:
			case SEQUENCE:
			case INHERIT:
			case TRANSLATE:
			case MERGE:
			case AT:
			case BITMAP:
			case CACHE:
			case NOCACHE:
			case CHECKPOINT:
			case CONSTRAINTS:
			case CYCLE:
			case NOCYCLE:
			case DBTIMEZONE:
			case ENCRYPT:
			case DECRYPT:
			case DEFERRABLE:
			case DEFERRED:
			case EDITION:
			case ELEMENT:
			case END:
			case EXCEPTIONS:
			case FORCE:
			case GLOBAL:
			case IDENTITY:
			case INITIALLY:
			case INVALIDATE:
			case JAVA:
			case LEVELS:
			case MAXVALUE:
			case MINVALUE:
			case NOMAXVALUE:
			case NOMINVALUE:
			case MINING:
			case MODEL:
			case NATIONAL:
			case NEW:
			case NOORDER:
			case NORELY:
			case ONLY:
			case PROFILE:
			case REF:
			case REKEY:
			case RELY:
			case REPLACE:
			case SALT:
			case SCOPE:
			case SORT:
			case SOURCE:
			case SUBSTITUTABLE:
			case TABLESPACE:
			case TEMPORARY:
			case TRANSLATION:
			case TREAT:
			case NO:
			case UNUSED:
			case NOVALIDATE:
			case VALUE:
			case VARYING:
			case VIRTUAL:
			case ZONE:
			case ADVISOR:
			case ADMINISTER:
			case TUNING:
			case MANAGE:
			case MANAGEMENT:
			case OBJECT:
			case CONTEXT:
			case EXEMPT:
			case REDACTION:
			case POLICY:
			case DATABASE:
			case SYSTEM:
			case LINK:
			case ANALYZE:
			case DICTIONARY:
			case DIMENSION:
			case INDEXTYPE:
			case EXTERNAL:
			case JOB:
			case CLASS:
			case PROGRAM:
			case SCHEDULER:
			case LIBRARY:
			case LOGMINING:
			case MATERIALIZED:
			case CUBE:
			case MEASURE:
			case FOLDER:
			case BUILD:
			case PROCESS:
			case OPERATOR:
			case OUTLINE:
			case PLUGGABLE:
			case CONTAINER:
			case SEGMENT:
			case RESTRICTED:
			case COST:
			case BACKUP:
			case UNLIMITED:
			case BECOME:
			case CHANGE:
			case NOTIFICATION:
			case PRIVILEGE:
			case PURGE:
			case RESUMABLE:
			case SYSGUID:
			case SYSBACKUP:
			case SYSDBA:
			case SYSDG:
			case SYSKM:
			case SYSOPER:
			case DBA_RECYCLEBIN:
			case FIRST:
			case RANK:
			case IDENTIFIER_:
			case STRING_:
			case INTEGER_:
			case NUMBER_:
			case HEX_DIGIT_:
			case BIT_NUM_:
				{
				setState(894);
				expr(0);
				setState(899);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(895);
					match(COMMA_);
					setState(896);
					expr(0);
					}
					}
					setState(901);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case ASTERISK_:
				{
				setState(902);
				match(ASTERISK_);
				}
				break;
			case RP_:
				break;
			default:
				break;
			}
			setState(905);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RegularFunctionNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(BaseRuleParser.IF, 0); }
		public TerminalNode LOCALTIME() { return getToken(BaseRuleParser.LOCALTIME, 0); }
		public TerminalNode LOCALTIMESTAMP() { return getToken(BaseRuleParser.LOCALTIMESTAMP, 0); }
		public TerminalNode INTERVAL() { return getToken(BaseRuleParser.INTERVAL, 0); }
		public RegularFunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regularFunctionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterRegularFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitRegularFunctionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitRegularFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegularFunctionNameContext regularFunctionName() throws RecognitionException {
		RegularFunctionNameContext _localctx = new RegularFunctionNameContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_regularFunctionName);
		try {
			setState(912);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(907);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(908);
				match(IF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(909);
				match(LOCALTIME);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(910);
				match(LOCALTIMESTAMP);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(911);
				match(INTERVAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseExpressionContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(BaseRuleParser.CASE, 0); }
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public List<CaseWhenContext> caseWhen() {
			return getRuleContexts(CaseWhenContext.class);
		}
		public CaseWhenContext caseWhen(int i) {
			return getRuleContext(CaseWhenContext.class,i);
		}
		public CaseElseContext caseElse() {
			return getRuleContext(CaseElseContext.class,0);
		}
		public CaseExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterCaseExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitCaseExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitCaseExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseExpressionContext caseExpression() throws RecognitionException {
		CaseExpressionContext _localctx = new CaseExpressionContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_caseExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(914);
			match(CASE);
			setState(916);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(915);
				simpleExpr(0);
				}
				break;
			}
			setState(919); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(918);
					caseWhen();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(921); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(924);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(923);
				caseElse();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseWhenContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(BaseRuleParser.WHEN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode THEN() { return getToken(BaseRuleParser.THEN, 0); }
		public CaseWhenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseWhen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterCaseWhen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitCaseWhen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitCaseWhen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseWhenContext caseWhen() throws RecognitionException {
		CaseWhenContext _localctx = new CaseWhenContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_caseWhen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(926);
			match(WHEN);
			setState(927);
			expr(0);
			setState(928);
			match(THEN);
			setState(929);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseElseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(BaseRuleParser.ELSE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CaseElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseElse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterCaseElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitCaseElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitCaseElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseElseContext caseElse() throws RecognitionException {
		CaseElseContext _localctx = new CaseElseContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_caseElse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(931);
			match(ELSE);
			setState(932);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubqueryContext extends ParserRuleContext {
		public MatchNoneContext matchNone() {
			return getRuleContext(MatchNoneContext.class,0);
		}
		public SubqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitSubquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubqueryContext subquery() throws RecognitionException {
		SubqueryContext _localctx = new SubqueryContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(934);
			matchNone();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderByClauseContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(BaseRuleParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(BaseRuleParser.BY, 0); }
		public List<OrderByItemContext> orderByItem() {
			return getRuleContexts(OrderByItemContext.class);
		}
		public OrderByItemContext orderByItem(int i) {
			return getRuleContext(OrderByItemContext.class,i);
		}
		public TerminalNode SIBLINGS() { return getToken(BaseRuleParser.SIBLINGS, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(BaseRuleParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(BaseRuleParser.COMMA_, i);
		}
		public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterOrderByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitOrderByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitOrderByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByClauseContext orderByClause() throws RecognitionException {
		OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_orderByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(936);
			match(ORDER);
			setState(938);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SIBLINGS) {
				{
				setState(937);
				match(SIBLINGS);
				}
			}

			setState(940);
			match(BY);
			setState(941);
			orderByItem();
			setState(946);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(942);
				match(COMMA_);
				setState(943);
				orderByItem();
				}
				}
				setState(948);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderByItemContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public NumberLiteralsContext numberLiterals() {
			return getRuleContext(NumberLiteralsContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NULLS() { return getToken(BaseRuleParser.NULLS, 0); }
		public TerminalNode FIRST() { return getToken(BaseRuleParser.FIRST, 0); }
		public TerminalNode LAST() { return getToken(BaseRuleParser.LAST, 0); }
		public TerminalNode ASC() { return getToken(BaseRuleParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(BaseRuleParser.DESC, 0); }
		public OrderByItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterOrderByItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitOrderByItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitOrderByItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByItemContext orderByItem() throws RecognitionException {
		OrderByItemContext _localctx = new OrderByItemContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_orderByItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(952);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(949);
				columnName();
				}
				break;
			case 2:
				{
				setState(950);
				numberLiterals();
				}
				break;
			case 3:
				{
				setState(951);
				expr(0);
				}
				break;
			}
			setState(955);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(954);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(961);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(957);
				match(NULLS);
				setState(958);
				match(FIRST);
				}
				break;
			case 2:
				{
				setState(959);
				match(NULLS);
				setState(960);
				match(LAST);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeNameContext extends ParserRuleContext {
		public OracleIdContext oracleId() {
			return getRuleContext(OracleIdContext.class,0);
		}
		public AttributeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterAttributeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitAttributeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitAttributeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeNameContext attributeName() throws RecognitionException {
		AttributeNameContext _localctx = new AttributeNameContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_attributeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(963);
			oracleId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleExprsContext extends ParserRuleContext {
		public List<SimpleExprContext> simpleExpr() {
			return getRuleContexts(SimpleExprContext.class);
		}
		public SimpleExprContext simpleExpr(int i) {
			return getRuleContext(SimpleExprContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(BaseRuleParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(BaseRuleParser.COMMA_, i);
		}
		public SimpleExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExprs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterSimpleExprs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitSimpleExprs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitSimpleExprs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleExprsContext simpleExprs() throws RecognitionException {
		SimpleExprsContext _localctx = new SimpleExprsContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_simpleExprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(965);
			simpleExpr(0);
			setState(970);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(966);
				match(COMMA_);
				setState(967);
				simpleExpr(0);
				}
				}
				setState(972);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LobItemContext extends ParserRuleContext {
		public AttributeNameContext attributeName() {
			return getRuleContext(AttributeNameContext.class,0);
		}
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public LobItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lobItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterLobItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitLobItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitLobItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LobItemContext lobItem() throws RecognitionException {
		LobItemContext _localctx = new LobItemContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_lobItem);
		try {
			setState(975);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(973);
				attributeName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(974);
				columnName();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LobItemsContext extends ParserRuleContext {
		public List<LobItemContext> lobItem() {
			return getRuleContexts(LobItemContext.class);
		}
		public LobItemContext lobItem(int i) {
			return getRuleContext(LobItemContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(BaseRuleParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(BaseRuleParser.COMMA_, i);
		}
		public LobItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lobItems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterLobItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitLobItems(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitLobItems(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LobItemsContext lobItems() throws RecognitionException {
		LobItemsContext _localctx = new LobItemsContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_lobItems);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(977);
			lobItem();
			setState(982);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(978);
				match(COMMA_);
				setState(979);
				lobItem();
				}
				}
				setState(984);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LobItemListContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(BaseRuleParser.LP_, 0); }
		public LobItemsContext lobItems() {
			return getRuleContext(LobItemsContext.class,0);
		}
		public TerminalNode RP_() { return getToken(BaseRuleParser.RP_, 0); }
		public LobItemListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lobItemList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterLobItemList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitLobItemList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitLobItemList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LobItemListContext lobItemList() throws RecognitionException {
		LobItemListContext _localctx = new LobItemListContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_lobItemList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(985);
			match(LP_);
			setState(986);
			lobItems();
			setState(987);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeContext extends ParserRuleContext {
		public DataTypeNameContext dataTypeName() {
			return getRuleContext(DataTypeNameContext.class,0);
		}
		public DataTypeLengthContext dataTypeLength() {
			return getRuleContext(DataTypeLengthContext.class,0);
		}
		public SpecialDatatypeContext specialDatatype() {
			return getRuleContext(SpecialDatatypeContext.class,0);
		}
		public DatetimeTypeSuffixContext datetimeTypeSuffix() {
			return getRuleContext(DatetimeTypeSuffixContext.class,0);
		}
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_dataType);
		int _la;
		try {
			setState(1000);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(989);
				dataTypeName();
				setState(991);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(990);
					dataTypeLength();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(993);
				specialDatatype();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(994);
				dataTypeName();
				setState(996);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(995);
					dataTypeLength();
					}
				}

				setState(998);
				datetimeTypeSuffix();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpecialDatatypeContext extends ParserRuleContext {
		public DataTypeNameContext dataTypeName() {
			return getRuleContext(DataTypeNameContext.class,0);
		}
		public TerminalNode LP_() { return getToken(BaseRuleParser.LP_, 0); }
		public TerminalNode NUMBER_() { return getToken(BaseRuleParser.NUMBER_, 0); }
		public TerminalNode CHAR() { return getToken(BaseRuleParser.CHAR, 0); }
		public TerminalNode RP_() { return getToken(BaseRuleParser.RP_, 0); }
		public TerminalNode NATIONAL() { return getToken(BaseRuleParser.NATIONAL, 0); }
		public TerminalNode VARYING() { return getToken(BaseRuleParser.VARYING, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public SpecialDatatypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specialDatatype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterSpecialDatatype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitSpecialDatatype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitSpecialDatatype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecialDatatypeContext specialDatatype() throws RecognitionException {
		SpecialDatatypeContext _localctx = new SpecialDatatypeContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_specialDatatype);
		int _la;
		try {
			setState(1025);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1002);
				dataTypeName();
				{
				setState(1003);
				match(LP_);
				setState(1004);
				match(NUMBER_);
				setState(1005);
				match(CHAR);
				setState(1006);
				match(RP_);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1008);
				match(NATIONAL);
				setState(1009);
				dataTypeName();
				setState(1011);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VARYING) {
					{
					setState(1010);
					match(VARYING);
					}
				}

				setState(1013);
				match(LP_);
				setState(1014);
				match(NUMBER_);
				setState(1015);
				match(RP_);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1017);
				dataTypeName();
				setState(1019);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1018);
					match(LP_);
					}
				}

				setState(1021);
				columnName();
				setState(1023);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
				case 1:
					{
					setState(1022);
					match(RP_);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeNameContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(BaseRuleParser.CHAR, 0); }
		public TerminalNode NCHAR() { return getToken(BaseRuleParser.NCHAR, 0); }
		public TerminalNode RAW() { return getToken(BaseRuleParser.RAW, 0); }
		public TerminalNode VARCHAR() { return getToken(BaseRuleParser.VARCHAR, 0); }
		public TerminalNode VARCHAR2() { return getToken(BaseRuleParser.VARCHAR2, 0); }
		public TerminalNode NVARCHAR2() { return getToken(BaseRuleParser.NVARCHAR2, 0); }
		public TerminalNode LONG() { return getToken(BaseRuleParser.LONG, 0); }
		public TerminalNode BLOB() { return getToken(BaseRuleParser.BLOB, 0); }
		public TerminalNode CLOB() { return getToken(BaseRuleParser.CLOB, 0); }
		public TerminalNode NCLOB() { return getToken(BaseRuleParser.NCLOB, 0); }
		public TerminalNode BINARY_FLOAT() { return getToken(BaseRuleParser.BINARY_FLOAT, 0); }
		public TerminalNode BINARY_DOUBLE() { return getToken(BaseRuleParser.BINARY_DOUBLE, 0); }
		public TerminalNode BOOLEAN() { return getToken(BaseRuleParser.BOOLEAN, 0); }
		public TerminalNode PLS_INTEGER() { return getToken(BaseRuleParser.PLS_INTEGER, 0); }
		public TerminalNode BINARY_INTEGER() { return getToken(BaseRuleParser.BINARY_INTEGER, 0); }
		public TerminalNode INTEGER() { return getToken(BaseRuleParser.INTEGER, 0); }
		public TerminalNode NUMBER() { return getToken(BaseRuleParser.NUMBER, 0); }
		public TerminalNode NATURAL() { return getToken(BaseRuleParser.NATURAL, 0); }
		public TerminalNode NATURALN() { return getToken(BaseRuleParser.NATURALN, 0); }
		public TerminalNode POSITIVE() { return getToken(BaseRuleParser.POSITIVE, 0); }
		public TerminalNode POSITIVEN() { return getToken(BaseRuleParser.POSITIVEN, 0); }
		public TerminalNode SIGNTYPE() { return getToken(BaseRuleParser.SIGNTYPE, 0); }
		public TerminalNode SIMPLE_INTEGER() { return getToken(BaseRuleParser.SIMPLE_INTEGER, 0); }
		public TerminalNode BFILE() { return getToken(BaseRuleParser.BFILE, 0); }
		public TerminalNode MLSLABEL() { return getToken(BaseRuleParser.MLSLABEL, 0); }
		public TerminalNode UROWID() { return getToken(BaseRuleParser.UROWID, 0); }
		public TerminalNode DATE() { return getToken(BaseRuleParser.DATE, 0); }
		public TerminalNode TIMESTAMP() { return getToken(BaseRuleParser.TIMESTAMP, 0); }
		public TerminalNode WITH() { return getToken(BaseRuleParser.WITH, 0); }
		public TerminalNode TIME() { return getToken(BaseRuleParser.TIME, 0); }
		public TerminalNode ZONE() { return getToken(BaseRuleParser.ZONE, 0); }
		public TerminalNode LOCAL() { return getToken(BaseRuleParser.LOCAL, 0); }
		public TerminalNode INTERVAL() { return getToken(BaseRuleParser.INTERVAL, 0); }
		public TerminalNode DAY() { return getToken(BaseRuleParser.DAY, 0); }
		public TerminalNode TO() { return getToken(BaseRuleParser.TO, 0); }
		public TerminalNode SECOND() { return getToken(BaseRuleParser.SECOND, 0); }
		public TerminalNode YEAR() { return getToken(BaseRuleParser.YEAR, 0); }
		public TerminalNode MONTH() { return getToken(BaseRuleParser.MONTH, 0); }
		public TerminalNode JSON() { return getToken(BaseRuleParser.JSON, 0); }
		public TerminalNode FLOAT() { return getToken(BaseRuleParser.FLOAT, 0); }
		public TerminalNode REAL() { return getToken(BaseRuleParser.REAL, 0); }
		public TerminalNode DOUBLE() { return getToken(BaseRuleParser.DOUBLE, 0); }
		public TerminalNode PRECISION() { return getToken(BaseRuleParser.PRECISION, 0); }
		public TerminalNode INT() { return getToken(BaseRuleParser.INT, 0); }
		public TerminalNode SMALLINT() { return getToken(BaseRuleParser.SMALLINT, 0); }
		public TerminalNode DECIMAL() { return getToken(BaseRuleParser.DECIMAL, 0); }
		public TerminalNode NUMERIC() { return getToken(BaseRuleParser.NUMERIC, 0); }
		public TerminalNode DEC() { return getToken(BaseRuleParser.DEC, 0); }
		public TerminalNode IDENTIFIER_() { return getToken(BaseRuleParser.IDENTIFIER_, 0); }
		public TerminalNode XMLTYPE() { return getToken(BaseRuleParser.XMLTYPE, 0); }
		public DataTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterDataTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitDataTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitDataTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeNameContext dataTypeName() throws RecognitionException {
		DataTypeNameContext _localctx = new DataTypeNameContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_dataTypeName);
		try {
			setState(1086);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1027);
				match(CHAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1028);
				match(NCHAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1029);
				match(RAW);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1030);
				match(VARCHAR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1031);
				match(VARCHAR2);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1032);
				match(NVARCHAR2);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1033);
				match(LONG);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1034);
				match(LONG);
				setState(1035);
				match(RAW);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1036);
				match(BLOB);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1037);
				match(CLOB);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1038);
				match(NCLOB);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1039);
				match(BINARY_FLOAT);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1040);
				match(BINARY_DOUBLE);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1041);
				match(BOOLEAN);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1042);
				match(PLS_INTEGER);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1043);
				match(BINARY_INTEGER);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1044);
				match(INTEGER);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1045);
				match(NUMBER);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1046);
				match(NATURAL);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1047);
				match(NATURALN);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1048);
				match(POSITIVE);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1049);
				match(POSITIVEN);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(1050);
				match(SIGNTYPE);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(1051);
				match(SIMPLE_INTEGER);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(1052);
				match(BFILE);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(1053);
				match(MLSLABEL);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(1054);
				match(UROWID);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(1055);
				match(DATE);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(1056);
				match(TIMESTAMP);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(1057);
				match(TIMESTAMP);
				setState(1058);
				match(WITH);
				setState(1059);
				match(TIME);
				setState(1060);
				match(ZONE);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(1061);
				match(TIMESTAMP);
				setState(1062);
				match(WITH);
				setState(1063);
				match(LOCAL);
				setState(1064);
				match(TIME);
				setState(1065);
				match(ZONE);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(1066);
				match(INTERVAL);
				setState(1067);
				match(DAY);
				setState(1068);
				match(TO);
				setState(1069);
				match(SECOND);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(1070);
				match(INTERVAL);
				setState(1071);
				match(YEAR);
				setState(1072);
				match(TO);
				setState(1073);
				match(MONTH);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(1074);
				match(JSON);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(1075);
				match(FLOAT);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(1076);
				match(REAL);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(1077);
				match(DOUBLE);
				setState(1078);
				match(PRECISION);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(1079);
				match(INT);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(1080);
				match(SMALLINT);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(1081);
				match(DECIMAL);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(1082);
				match(NUMERIC);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(1083);
				match(DEC);
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(1084);
				match(IDENTIFIER_);
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(1085);
				match(XMLTYPE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DatetimeTypeSuffixContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(BaseRuleParser.WITH, 0); }
		public TerminalNode TIME() { return getToken(BaseRuleParser.TIME, 0); }
		public TerminalNode ZONE() { return getToken(BaseRuleParser.ZONE, 0); }
		public TerminalNode LOCAL() { return getToken(BaseRuleParser.LOCAL, 0); }
		public TerminalNode TO() { return getToken(BaseRuleParser.TO, 0); }
		public TerminalNode MONTH() { return getToken(BaseRuleParser.MONTH, 0); }
		public TerminalNode SECOND() { return getToken(BaseRuleParser.SECOND, 0); }
		public TerminalNode LP_() { return getToken(BaseRuleParser.LP_, 0); }
		public TerminalNode NUMBER_() { return getToken(BaseRuleParser.NUMBER_, 0); }
		public TerminalNode RP_() { return getToken(BaseRuleParser.RP_, 0); }
		public DatetimeTypeSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datetimeTypeSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterDatetimeTypeSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitDatetimeTypeSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitDatetimeTypeSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatetimeTypeSuffixContext datetimeTypeSuffix() throws RecognitionException {
		DatetimeTypeSuffixContext _localctx = new DatetimeTypeSuffixContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_datetimeTypeSuffix);
		int _la;
		try {
			setState(1105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1094);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(1088);
					match(WITH);
					setState(1090);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LOCAL) {
						{
						setState(1089);
						match(LOCAL);
						}
					}

					setState(1092);
					match(TIME);
					setState(1093);
					match(ZONE);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1096);
				match(TO);
				setState(1097);
				match(MONTH);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1098);
				match(TO);
				setState(1099);
				match(SECOND);
				setState(1103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1100);
					match(LP_);
					setState(1101);
					match(NUMBER_);
					setState(1102);
					match(RP_);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TreatFunctionContext extends ParserRuleContext {
		public TerminalNode TREAT() { return getToken(BaseRuleParser.TREAT, 0); }
		public TerminalNode LP_() { return getToken(BaseRuleParser.LP_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode AS() { return getToken(BaseRuleParser.AS, 0); }
		public DataTypeNameContext dataTypeName() {
			return getRuleContext(DataTypeNameContext.class,0);
		}
		public TerminalNode RP_() { return getToken(BaseRuleParser.RP_, 0); }
		public TerminalNode REF() { return getToken(BaseRuleParser.REF, 0); }
		public TreatFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_treatFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterTreatFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitTreatFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitTreatFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TreatFunctionContext treatFunction() throws RecognitionException {
		TreatFunctionContext _localctx = new TreatFunctionContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_treatFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1107);
			match(TREAT);
			setState(1108);
			match(LP_);
			setState(1109);
			expr(0);
			setState(1110);
			match(AS);
			setState(1112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REF) {
				{
				setState(1111);
				match(REF);
				}
			}

			setState(1114);
			dataTypeName();
			setState(1115);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrivateExprOfDbContext extends ParserRuleContext {
		public TreatFunctionContext treatFunction() {
			return getRuleContext(TreatFunctionContext.class,0);
		}
		public CaseExprContext caseExpr() {
			return getRuleContext(CaseExprContext.class,0);
		}
		public IntervalExpressionContext intervalExpression() {
			return getRuleContext(IntervalExpressionContext.class,0);
		}
		public ObjectAccessExpressionContext objectAccessExpression() {
			return getRuleContext(ObjectAccessExpressionContext.class,0);
		}
		public ConstructorExprContext constructorExpr() {
			return getRuleContext(ConstructorExprContext.class,0);
		}
		public PrivateExprOfDbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privateExprOfDb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterPrivateExprOfDb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitPrivateExprOfDb(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitPrivateExprOfDb(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrivateExprOfDbContext privateExprOfDb() throws RecognitionException {
		PrivateExprOfDbContext _localctx = new PrivateExprOfDbContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_privateExprOfDb);
		try {
			setState(1122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1117);
				treatFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1118);
				caseExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1119);
				intervalExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1120);
				objectAccessExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1121);
				constructorExpr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseExprContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(BaseRuleParser.CASE, 0); }
		public TerminalNode END() { return getToken(BaseRuleParser.END, 0); }
		public SimpleCaseExprContext simpleCaseExpr() {
			return getRuleContext(SimpleCaseExprContext.class,0);
		}
		public SearchedCaseExprContext searchedCaseExpr() {
			return getRuleContext(SearchedCaseExprContext.class,0);
		}
		public ElseClauseContext elseClause() {
			return getRuleContext(ElseClauseContext.class,0);
		}
		public CaseExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterCaseExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitCaseExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitCaseExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseExprContext caseExpr() throws RecognitionException {
		CaseExprContext _localctx = new CaseExprContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_caseExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1124);
			match(CASE);
			setState(1127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(1125);
				simpleCaseExpr();
				}
				break;
			case 2:
				{
				setState(1126);
				searchedCaseExpr();
				}
				break;
			}
			setState(1130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(1129);
				elseClause();
				}
			}

			setState(1132);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleCaseExprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<SearchedCaseExprContext> searchedCaseExpr() {
			return getRuleContexts(SearchedCaseExprContext.class);
		}
		public SearchedCaseExprContext searchedCaseExpr(int i) {
			return getRuleContext(SearchedCaseExprContext.class,i);
		}
		public SimpleCaseExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleCaseExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterSimpleCaseExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitSimpleCaseExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitSimpleCaseExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleCaseExprContext simpleCaseExpr() throws RecognitionException {
		SimpleCaseExprContext _localctx = new SimpleCaseExprContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_simpleCaseExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1134);
			expr(0);
			setState(1136); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1135);
				searchedCaseExpr();
				}
				}
				setState(1138); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SearchedCaseExprContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(BaseRuleParser.WHEN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode THEN() { return getToken(BaseRuleParser.THEN, 0); }
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public SearchedCaseExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_searchedCaseExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterSearchedCaseExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitSearchedCaseExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitSearchedCaseExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SearchedCaseExprContext searchedCaseExpr() throws RecognitionException {
		SearchedCaseExprContext _localctx = new SearchedCaseExprContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_searchedCaseExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1140);
			match(WHEN);
			setState(1141);
			expr(0);
			setState(1142);
			match(THEN);
			setState(1143);
			simpleExpr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseClauseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(BaseRuleParser.ELSE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ElseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterElseClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitElseClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitElseClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseClauseContext elseClause() throws RecognitionException {
		ElseClauseContext _localctx = new ElseClauseContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_elseClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1145);
			match(ELSE);
			setState(1146);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalExpressionContext extends ParserRuleContext {
		public List<TerminalNode> LP_() { return getTokens(BaseRuleParser.LP_); }
		public TerminalNode LP_(int i) {
			return getToken(BaseRuleParser.LP_, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MINUS_() { return getToken(BaseRuleParser.MINUS_, 0); }
		public List<TerminalNode> RP_() { return getTokens(BaseRuleParser.RP_); }
		public TerminalNode RP_(int i) {
			return getToken(BaseRuleParser.RP_, i);
		}
		public TerminalNode DAY() { return getToken(BaseRuleParser.DAY, 0); }
		public TerminalNode TO() { return getToken(BaseRuleParser.TO, 0); }
		public TerminalNode SECOND() { return getToken(BaseRuleParser.SECOND, 0); }
		public TerminalNode YEAR() { return getToken(BaseRuleParser.YEAR, 0); }
		public TerminalNode MONTH() { return getToken(BaseRuleParser.MONTH, 0); }
		public List<TerminalNode> NUMBER_() { return getTokens(BaseRuleParser.NUMBER_); }
		public TerminalNode NUMBER_(int i) {
			return getToken(BaseRuleParser.NUMBER_, i);
		}
		public IntervalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterIntervalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitIntervalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitIntervalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalExpressionContext intervalExpression() throws RecognitionException {
		IntervalExpressionContext _localctx = new IntervalExpressionContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_intervalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1148);
			match(LP_);
			setState(1149);
			expr(0);
			setState(1150);
			match(MINUS_);
			setState(1151);
			expr(0);
			setState(1152);
			match(RP_);
			setState(1174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DAY:
				{
				setState(1153);
				match(DAY);
				setState(1157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1154);
					match(LP_);
					setState(1155);
					match(NUMBER_);
					setState(1156);
					match(RP_);
					}
				}

				setState(1159);
				match(TO);
				setState(1160);
				match(SECOND);
				setState(1164);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
				case 1:
					{
					setState(1161);
					match(LP_);
					setState(1162);
					match(NUMBER_);
					setState(1163);
					match(RP_);
					}
					break;
				}
				}
				break;
			case YEAR:
				{
				setState(1166);
				match(YEAR);
				setState(1170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1167);
					match(LP_);
					setState(1168);
					match(NUMBER_);
					setState(1169);
					match(RP_);
					}
				}

				setState(1172);
				match(TO);
				setState(1173);
				match(MONTH);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectAccessExpressionContext extends ParserRuleContext {
		public List<TerminalNode> DOT_() { return getTokens(BaseRuleParser.DOT_); }
		public TerminalNode DOT_(int i) {
			return getToken(BaseRuleParser.DOT_, i);
		}
		public TerminalNode LP_() { return getToken(BaseRuleParser.LP_, 0); }
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public TerminalNode RP_() { return getToken(BaseRuleParser.RP_, 0); }
		public TreatFunctionContext treatFunction() {
			return getRuleContext(TreatFunctionContext.class,0);
		}
		public List<AttributeNameContext> attributeName() {
			return getRuleContexts(AttributeNameContext.class);
		}
		public AttributeNameContext attributeName(int i) {
			return getRuleContext(AttributeNameContext.class,i);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ObjectAccessExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectAccessExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterObjectAccessExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitObjectAccessExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitObjectAccessExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectAccessExpressionContext objectAccessExpression() throws RecognitionException {
		ObjectAccessExpressionContext _localctx = new ObjectAccessExpressionContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_objectAccessExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP_:
				{
				setState(1176);
				match(LP_);
				setState(1177);
				simpleExpr(0);
				setState(1178);
				match(RP_);
				}
				break;
			case TREAT:
				{
				setState(1180);
				treatFunction();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1183);
			match(DOT_);
			setState(1197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(1184);
				attributeName();
				setState(1189);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1185);
						match(DOT_);
						setState(1186);
						attributeName();
						}
						} 
					}
					setState(1191);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
				}
				setState(1194);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
				case 1:
					{
					setState(1192);
					match(DOT_);
					setState(1193);
					functionCall();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(1196);
				functionCall();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorExprContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(BaseRuleParser.NEW, 0); }
		public DataTypeNameContext dataTypeName() {
			return getRuleContext(DataTypeNameContext.class,0);
		}
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public ConstructorExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterConstructorExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitConstructorExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitConstructorExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorExprContext constructorExpr() throws RecognitionException {
		ConstructorExprContext _localctx = new ConstructorExprContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_constructorExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1199);
			match(NEW);
			setState(1200);
			dataTypeName();
			setState(1201);
			exprList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IgnoredIdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(BaseRuleParser.IDENTIFIER_, 0); }
		public IgnoredIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ignoredIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterIgnoredIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitIgnoredIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitIgnoredIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IgnoredIdentifierContext ignoredIdentifier() throws RecognitionException {
		IgnoredIdentifierContext _localctx = new IgnoredIdentifierContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_ignoredIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1203);
			match(IDENTIFIER_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IgnoredIdentifiersContext extends ParserRuleContext {
		public List<IgnoredIdentifierContext> ignoredIdentifier() {
			return getRuleContexts(IgnoredIdentifierContext.class);
		}
		public IgnoredIdentifierContext ignoredIdentifier(int i) {
			return getRuleContext(IgnoredIdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(BaseRuleParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(BaseRuleParser.COMMA_, i);
		}
		public IgnoredIdentifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ignoredIdentifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterIgnoredIdentifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitIgnoredIdentifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitIgnoredIdentifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IgnoredIdentifiersContext ignoredIdentifiers() throws RecognitionException {
		IgnoredIdentifiersContext _localctx = new IgnoredIdentifiersContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_ignoredIdentifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1205);
			ignoredIdentifier();
			setState(1210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1206);
				match(COMMA_);
				setState(1207);
				ignoredIdentifier();
				}
				}
				setState(1212);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MatchNoneContext extends ParserRuleContext {
		public MatchNoneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchNone; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterMatchNone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitMatchNone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitMatchNone(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchNoneContext matchNone() throws RecognitionException {
		MatchNoneContext _localctx = new MatchNoneContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_matchNone);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1213);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HashSubpartitionQuantityContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(BaseRuleParser.NUMBER, 0); }
		public HashSubpartitionQuantityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hashSubpartitionQuantity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterHashSubpartitionQuantity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitHashSubpartitionQuantity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitHashSubpartitionQuantity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HashSubpartitionQuantityContext hashSubpartitionQuantity() throws RecognitionException {
		HashSubpartitionQuantityContext _localctx = new HashSubpartitionQuantityContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_hashSubpartitionQuantity);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1215);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OdciParametersContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public OdciParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_odciParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterOdciParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitOdciParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitOdciParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OdciParametersContext odciParameters() throws RecognitionException {
		OdciParametersContext _localctx = new OdciParametersContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_odciParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1217);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DatabaseNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DatabaseNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_databaseName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterDatabaseName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitDatabaseName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitDatabaseName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatabaseNameContext databaseName() throws RecognitionException {
		DatabaseNameContext _localctx = new DatabaseNameContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_databaseName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1219);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocationNameContext extends ParserRuleContext {
		public TerminalNode STRING_() { return getToken(BaseRuleParser.STRING_, 0); }
		public LocationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_locationName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterLocationName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitLocationName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitLocationName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocationNameContext locationName() throws RecognitionException {
		LocationNameContext _localctx = new LocationNameContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_locationName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1221);
			match(STRING_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FileNameContext extends ParserRuleContext {
		public TerminalNode STRING_() { return getToken(BaseRuleParser.STRING_, 0); }
		public FileNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterFileName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitFileName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitFileName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileNameContext fileName() throws RecognitionException {
		FileNameContext _localctx = new FileNameContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_fileName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1223);
			match(STRING_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsmFileNameContext extends ParserRuleContext {
		public TerminalNode STRING_() { return getToken(BaseRuleParser.STRING_, 0); }
		public AsmFileNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asmFileName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterAsmFileName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitAsmFileName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitAsmFileName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsmFileNameContext asmFileName() throws RecognitionException {
		AsmFileNameContext _localctx = new AsmFileNameContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_asmFileName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1225);
			match(STRING_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FileNumberContext extends ParserRuleContext {
		public TerminalNode INTEGER_() { return getToken(BaseRuleParser.INTEGER_, 0); }
		public FileNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterFileNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitFileNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitFileNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileNumberContext fileNumber() throws RecognitionException {
		FileNumberContext _localctx = new FileNumberContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_fileNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1227);
			match(INTEGER_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstanceNameContext extends ParserRuleContext {
		public TerminalNode STRING_() { return getToken(BaseRuleParser.STRING_, 0); }
		public InstanceNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterInstanceName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitInstanceName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitInstanceName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstanceNameContext instanceName() throws RecognitionException {
		InstanceNameContext _localctx = new InstanceNameContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_instanceName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1229);
			match(STRING_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogminerSessionNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LogminerSessionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logminerSessionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterLogminerSessionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitLogminerSessionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitLogminerSessionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogminerSessionNameContext logminerSessionName() throws RecognitionException {
		LogminerSessionNameContext _localctx = new LogminerSessionNameContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_logminerSessionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1231);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablespaceGroupNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TablespaceGroupNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablespaceGroupName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterTablespaceGroupName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitTablespaceGroupName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitTablespaceGroupName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablespaceGroupNameContext tablespaceGroupName() throws RecognitionException {
		TablespaceGroupNameContext _localctx = new TablespaceGroupNameContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_tablespaceGroupName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1233);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CopyNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public CopyNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_copyName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterCopyName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitCopyName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitCopyName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CopyNameContext copyName() throws RecognitionException {
		CopyNameContext _localctx = new CopyNameContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_copyName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1235);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MirrorNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MirrorNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mirrorName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterMirrorName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitMirrorName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitMirrorName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MirrorNameContext mirrorName() throws RecognitionException {
		MirrorNameContext _localctx = new MirrorNameContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_mirrorName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1237);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UriStringContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public UriStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uriString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterUriString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitUriString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitUriString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UriStringContext uriString() throws RecognitionException {
		UriStringContext _localctx = new UriStringContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_uriString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1239);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedCredentialNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public QualifiedCredentialNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedCredentialName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterQualifiedCredentialName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitQualifiedCredentialName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitQualifiedCredentialName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedCredentialNameContext qualifiedCredentialName() throws RecognitionException {
		QualifiedCredentialNameContext _localctx = new QualifiedCredentialNameContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_qualifiedCredentialName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1241);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PdbNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PdbNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pdbName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterPdbName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitPdbName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitPdbName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PdbNameContext pdbName() throws RecognitionException {
		PdbNameContext _localctx = new PdbNameContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_pdbName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1243);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiskgroupNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DiskgroupNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diskgroupName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterDiskgroupName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitDiskgroupName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitDiskgroupName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DiskgroupNameContext diskgroupName() throws RecognitionException {
		DiskgroupNameContext _localctx = new DiskgroupNameContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_diskgroupName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1245);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplateNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TemplateNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterTemplateName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitTemplateName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitTemplateName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateNameContext templateName() throws RecognitionException {
		TemplateNameContext _localctx = new TemplateNameContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_templateName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1247);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AliasNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AliasNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliasName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterAliasName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitAliasName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitAliasName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasNameContext aliasName() throws RecognitionException {
		AliasNameContext _localctx = new AliasNameContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_aliasName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1249);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DomainContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DomainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_domain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterDomain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitDomain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitDomain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DomainContext domain() throws RecognitionException {
		DomainContext _localctx = new DomainContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_domain);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1251);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DateValueContext extends ParserRuleContext {
		public DateTimeLiteralsContext dateTimeLiterals() {
			return getRuleContext(DateTimeLiteralsContext.class,0);
		}
		public StringLiteralsContext stringLiterals() {
			return getRuleContext(StringLiteralsContext.class,0);
		}
		public NumberLiteralsContext numberLiterals() {
			return getRuleContext(NumberLiteralsContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DateValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterDateValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitDateValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitDateValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateValueContext dateValue() throws RecognitionException {
		DateValueContext _localctx = new DateValueContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_dateValue);
		try {
			setState(1257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1253);
				dateTimeLiterals();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1254);
				stringLiterals();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1255);
				numberLiterals();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1256);
				expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SessionIdContext extends ParserRuleContext {
		public NumberLiteralsContext numberLiterals() {
			return getRuleContext(NumberLiteralsContext.class,0);
		}
		public SessionIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sessionId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterSessionId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitSessionId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitSessionId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SessionIdContext sessionId() throws RecognitionException {
		SessionIdContext _localctx = new SessionIdContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_sessionId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1259);
			numberLiterals();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SerialNumberContext extends ParserRuleContext {
		public NumberLiteralsContext numberLiterals() {
			return getRuleContext(NumberLiteralsContext.class,0);
		}
		public SerialNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serialNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterSerialNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitSerialNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitSerialNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SerialNumberContext serialNumber() throws RecognitionException {
		SerialNumberContext _localctx = new SerialNumberContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_serialNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1261);
			numberLiterals();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstanceIdContext extends ParserRuleContext {
		public TerminalNode NUMBER_() { return getToken(BaseRuleParser.NUMBER_, 0); }
		public InstanceIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterInstanceId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitInstanceId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitInstanceId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstanceIdContext instanceId() throws RecognitionException {
		InstanceIdContext _localctx = new InstanceIdContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_instanceId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1263);
			match(NUMBER_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlIdContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SqlIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterSqlId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitSqlId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitSqlId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlIdContext sqlId() throws RecognitionException {
		SqlIdContext _localctx = new SqlIdContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_sqlId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1265);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogFileNameContext extends ParserRuleContext {
		public StringLiteralsContext stringLiterals() {
			return getRuleContext(StringLiteralsContext.class,0);
		}
		public LogFileNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logFileName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterLogFileName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitLogFileName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitLogFileName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogFileNameContext logFileName() throws RecognitionException {
		LogFileNameContext _localctx = new LogFileNameContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_logFileName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1267);
			stringLiterals();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogFileGroupsArchivedLocationNameContext extends ParserRuleContext {
		public StringLiteralsContext stringLiterals() {
			return getRuleContext(StringLiteralsContext.class,0);
		}
		public LogFileGroupsArchivedLocationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logFileGroupsArchivedLocationName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterLogFileGroupsArchivedLocationName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitLogFileGroupsArchivedLocationName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitLogFileGroupsArchivedLocationName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogFileGroupsArchivedLocationNameContext logFileGroupsArchivedLocationName() throws RecognitionException {
		LogFileGroupsArchivedLocationNameContext _localctx = new LogFileGroupsArchivedLocationNameContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_logFileGroupsArchivedLocationName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1269);
			stringLiterals();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsmVersionContext extends ParserRuleContext {
		public StringLiteralsContext stringLiterals() {
			return getRuleContext(StringLiteralsContext.class,0);
		}
		public AsmVersionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asmVersion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterAsmVersion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitAsmVersion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitAsmVersion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsmVersionContext asmVersion() throws RecognitionException {
		AsmVersionContext _localctx = new AsmVersionContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_asmVersion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1271);
			stringLiterals();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WalletPasswordContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public WalletPasswordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_walletPassword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterWalletPassword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitWalletPassword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitWalletPassword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WalletPasswordContext walletPassword() throws RecognitionException {
		WalletPasswordContext _localctx = new WalletPasswordContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_walletPassword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1273);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HsmAuthStringContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public HsmAuthStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hsmAuthString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterHsmAuthString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitHsmAuthString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitHsmAuthString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HsmAuthStringContext hsmAuthString() throws RecognitionException {
		HsmAuthStringContext _localctx = new HsmAuthStringContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_hsmAuthString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1275);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TargetDbNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TargetDbNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_targetDbName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterTargetDbName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitTargetDbName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitTargetDbName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TargetDbNameContext targetDbName() throws RecognitionException {
		TargetDbNameContext _localctx = new TargetDbNameContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_targetDbName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1277);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CertificateIdContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public CertificateIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_certificateId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterCertificateId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitCertificateId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitCertificateId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CertificateIdContext certificateId() throws RecognitionException {
		CertificateIdContext _localctx = new CertificateIdContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_certificateId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1279);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CategoryNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public CategoryNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_categoryName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterCategoryName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitCategoryName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitCategoryName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CategoryNameContext categoryName() throws RecognitionException {
		CategoryNameContext _localctx = new CategoryNameContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_categoryName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1281);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OffsetContext extends ParserRuleContext {
		public NumberLiteralsContext numberLiterals() {
			return getRuleContext(NumberLiteralsContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NullValueLiteralsContext nullValueLiterals() {
			return getRuleContext(NullValueLiteralsContext.class,0);
		}
		public OffsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_offset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterOffset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitOffset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitOffset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OffsetContext offset() throws RecognitionException {
		OffsetContext _localctx = new OffsetContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_offset);
		try {
			setState(1286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1283);
				numberLiterals();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1284);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1285);
				nullValueLiterals();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RowcountContext extends ParserRuleContext {
		public NumberLiteralsContext numberLiterals() {
			return getRuleContext(NumberLiteralsContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NullValueLiteralsContext nullValueLiterals() {
			return getRuleContext(NullValueLiteralsContext.class,0);
		}
		public RowcountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowcount; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterRowcount(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitRowcount(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitRowcount(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowcountContext rowcount() throws RecognitionException {
		RowcountContext _localctx = new RowcountContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_rowcount);
		try {
			setState(1291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1288);
				numberLiterals();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1289);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1290);
				nullValueLiterals();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PercentContext extends ParserRuleContext {
		public NumberLiteralsContext numberLiterals() {
			return getRuleContext(NumberLiteralsContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NullValueLiteralsContext nullValueLiterals() {
			return getRuleContext(NullValueLiteralsContext.class,0);
		}
		public PercentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_percent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterPercent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitPercent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitPercent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PercentContext percent() throws RecognitionException {
		PercentContext _localctx = new PercentContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_percent);
		try {
			setState(1296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1293);
				numberLiterals();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1294);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1295);
				nullValueLiterals();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RollbackSegmentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public RollbackSegmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollbackSegment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterRollbackSegment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitRollbackSegment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitRollbackSegment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RollbackSegmentContext rollbackSegment() throws RecognitionException {
		RollbackSegmentContext _localctx = new RollbackSegmentContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_rollbackSegment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1298);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryNameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public OwnerContext owner() {
			return getRuleContext(OwnerContext.class,0);
		}
		public TerminalNode DOT_() { return getToken(BaseRuleParser.DOT_, 0); }
		public QueryNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterQueryName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitQueryName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitQueryName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryNameContext queryName() throws RecognitionException {
		QueryNameContext _localctx = new QueryNameContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_queryName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				{
				setState(1300);
				owner();
				setState(1301);
				match(DOT_);
				}
				break;
			}
			setState(1305);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CycleValueContext extends ParserRuleContext {
		public TerminalNode STRING_() { return getToken(BaseRuleParser.STRING_, 0); }
		public CycleValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cycleValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterCycleValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitCycleValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitCycleValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CycleValueContext cycleValue() throws RecognitionException {
		CycleValueContext _localctx = new CycleValueContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_cycleValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1307);
			match(STRING_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoCycleValueContext extends ParserRuleContext {
		public TerminalNode STRING_() { return getToken(BaseRuleParser.STRING_, 0); }
		public NoCycleValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noCycleValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterNoCycleValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitNoCycleValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitNoCycleValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoCycleValueContext noCycleValue() throws RecognitionException {
		NoCycleValueContext _localctx = new NoCycleValueContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_noCycleValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1309);
			match(STRING_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderingColumnContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public OrderingColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderingColumn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterOrderingColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitOrderingColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitOrderingColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderingColumnContext orderingColumn() throws RecognitionException {
		OrderingColumnContext _localctx = new OrderingColumnContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_orderingColumn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1311);
			columnName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubavNameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public OwnerContext owner() {
			return getRuleContext(OwnerContext.class,0);
		}
		public TerminalNode DOT_() { return getToken(BaseRuleParser.DOT_, 0); }
		public SubavNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subavName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterSubavName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitSubavName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitSubavName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubavNameContext subavName() throws RecognitionException {
		SubavNameContext _localctx = new SubavNameContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_subavName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1316);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				{
				setState(1313);
				owner();
				setState(1314);
				match(DOT_);
				}
				break;
			}
			setState(1318);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BaseAvNameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public OwnerContext owner() {
			return getRuleContext(OwnerContext.class,0);
		}
		public TerminalNode DOT_() { return getToken(BaseRuleParser.DOT_, 0); }
		public BaseAvNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseAvName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterBaseAvName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitBaseAvName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitBaseAvName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseAvNameContext baseAvName() throws RecognitionException {
		BaseAvNameContext _localctx = new BaseAvNameContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_baseAvName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				{
				setState(1320);
				owner();
				setState(1321);
				match(DOT_);
				}
				break;
			}
			setState(1325);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MeasNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MeasNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_measName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterMeasName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitMeasName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitMeasName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MeasNameContext measName() throws RecognitionException {
		MeasNameContext _localctx = new MeasNameContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_measName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1327);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LevelRefContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LevelRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_levelRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterLevelRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitLevelRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitLevelRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LevelRefContext levelRef() throws RecognitionException {
		LevelRefContext _localctx = new LevelRefContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_levelRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1329);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OffsetExprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NumberLiteralsContext numberLiterals() {
			return getRuleContext(NumberLiteralsContext.class,0);
		}
		public OffsetExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_offsetExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterOffsetExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitOffsetExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitOffsetExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OffsetExprContext offsetExpr() throws RecognitionException {
		OffsetExprContext _localctx = new OffsetExprContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_offsetExpr);
		try {
			setState(1333);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1331);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1332);
				numberLiterals();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberKeyExprContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MemberKeyExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberKeyExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterMemberKeyExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitMemberKeyExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitMemberKeyExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberKeyExprContext memberKeyExpr() throws RecognitionException {
		MemberKeyExprContext _localctx = new MemberKeyExprContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_memberKeyExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1335);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DepthExpressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DepthExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_depthExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterDepthExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitDepthExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitDepthExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DepthExpressionContext depthExpression() throws RecognitionException {
		DepthExpressionContext _localctx = new DepthExpressionContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_depthExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1337);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnitNameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public OwnerContext owner() {
			return getRuleContext(OwnerContext.class,0);
		}
		public TerminalNode DOT_() { return getToken(BaseRuleParser.DOT_, 0); }
		public UnitNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unitName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterUnitName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitUnitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitUnitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnitNameContext unitName() throws RecognitionException {
		UnitNameContext _localctx = new UnitNameContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_unitName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1342);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(1339);
				owner();
				setState(1340);
				match(DOT_);
				}
				break;
			}
			setState(1344);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcedureNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ProcedureNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterProcedureName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitProcedureName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitProcedureName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureNameContext procedureName() throws RecognitionException {
		ProcedureNameContext _localctx = new ProcedureNameContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_procedureName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1346);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CpuCostContext extends ParserRuleContext {
		public TerminalNode INTEGER_() { return getToken(BaseRuleParser.INTEGER_, 0); }
		public CpuCostContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cpuCost; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterCpuCost(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitCpuCost(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitCpuCost(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CpuCostContext cpuCost() throws RecognitionException {
		CpuCostContext _localctx = new CpuCostContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_cpuCost);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1348);
			match(INTEGER_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IoCostContext extends ParserRuleContext {
		public TerminalNode INTEGER_() { return getToken(BaseRuleParser.INTEGER_, 0); }
		public IoCostContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ioCost; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterIoCost(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitIoCost(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitIoCost(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IoCostContext ioCost() throws RecognitionException {
		IoCostContext _localctx = new IoCostContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_ioCost);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1350);
			match(INTEGER_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NetworkCostContext extends ParserRuleContext {
		public TerminalNode INTEGER_() { return getToken(BaseRuleParser.INTEGER_, 0); }
		public NetworkCostContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_networkCost; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterNetworkCost(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitNetworkCost(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitNetworkCost(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NetworkCostContext networkCost() throws RecognitionException {
		NetworkCostContext _localctx = new NetworkCostContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_networkCost);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1352);
			match(INTEGER_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultSelectivityContext extends ParserRuleContext {
		public TerminalNode INTEGER_() { return getToken(BaseRuleParser.INTEGER_, 0); }
		public DefaultSelectivityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultSelectivity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterDefaultSelectivity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitDefaultSelectivity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitDefaultSelectivity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultSelectivityContext defaultSelectivity() throws RecognitionException {
		DefaultSelectivityContext _localctx = new DefaultSelectivityContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_defaultSelectivity);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1354);
			match(INTEGER_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataItemContext extends ParserRuleContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public DataItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterDataItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitDataItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitDataItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataItemContext dataItem() throws RecognitionException {
		DataItemContext _localctx = new DataItemContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_dataItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1356);
			variableName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StringLiteralsContext stringLiterals() {
			return getRuleContext(StringLiteralsContext.class,0);
		}
		public VariableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterVariableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitVariableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitVariableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableNameContext variableName() throws RecognitionException {
		VariableNameContext _localctx = new VariableNameContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_variableName);
		try {
			setState(1360);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUNCATE:
			case SCHEMA:
			case FUNCTION:
			case PROCEDURE:
			case CASE:
			case WHEN:
			case CAST:
			case TRIM:
			case SUBSTRING:
			case NATURAL:
			case JOIN:
			case FULL:
			case INNER:
			case OUTER:
			case LEFT:
			case RIGHT:
			case CROSS:
			case USING:
			case IF:
			case TRUE:
			case FALSE:
			case LIMIT:
			case OFFSET:
			case BEGIN:
			case COMMIT:
			case ROLLBACK:
			case SAVEPOINT:
			case BOOLEAN:
			case DOUBLE:
			case CHARACTER:
			case ARRAY:
			case INTERVAL:
			case TIME:
			case TIMESTAMP:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case YEAR:
			case QUARTER:
			case MONTH:
			case WEEK:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case MICROSECOND:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case ENABLE:
			case DISABLE:
			case PRESERVE:
			case DO:
			case DEFINER:
			case CURRENT_USER:
			case SQL:
			case CASCADED:
			case LOCAL:
			case CLOSE:
			case OPEN:
			case NEXT:
			case NAME:
			case COLLATION:
			case NAMES:
			case REAL:
			case TYPE:
			case BINARY:
			case ESCAPE:
			case MOD:
			case XOR:
			case UNKNOWN:
			case ALWAYS:
			case CASCADE:
			case GENERATED:
			case PRIVILEGES:
			case READ:
			case WRITE:
			case REFERENCES:
			case TRANSACTION:
			case ROLE:
			case VISIBLE:
			case INVISIBLE:
			case EXECUTE:
			case USE:
			case DEBUG:
			case UNDER:
			case FLASHBACK:
			case ARCHIVE:
			case REFRESH:
			case QUERY:
			case REWRITE:
			case KEEP:
			case SEQUENCE:
			case INHERIT:
			case TRANSLATE:
			case MERGE:
			case AT:
			case BITMAP:
			case CACHE:
			case NOCACHE:
			case CHECKPOINT:
			case CONSTRAINTS:
			case CYCLE:
			case NOCYCLE:
			case DBTIMEZONE:
			case ENCRYPT:
			case DECRYPT:
			case DEFERRABLE:
			case DEFERRED:
			case EDITION:
			case ELEMENT:
			case END:
			case EXCEPTIONS:
			case FORCE:
			case GLOBAL:
			case IDENTITY:
			case INITIALLY:
			case INVALIDATE:
			case JAVA:
			case LEVELS:
			case MAXVALUE:
			case MINVALUE:
			case NOMAXVALUE:
			case NOMINVALUE:
			case MINING:
			case MODEL:
			case NATIONAL:
			case NEW:
			case NOORDER:
			case NORELY:
			case ONLY:
			case PROFILE:
			case REF:
			case REKEY:
			case RELY:
			case REPLACE:
			case SALT:
			case SCOPE:
			case SORT:
			case SOURCE:
			case SUBSTITUTABLE:
			case TABLESPACE:
			case TEMPORARY:
			case TRANSLATION:
			case TREAT:
			case NO:
			case UNUSED:
			case NOVALIDATE:
			case VALUE:
			case VARYING:
			case VIRTUAL:
			case ZONE:
			case ADVISOR:
			case ADMINISTER:
			case TUNING:
			case MANAGE:
			case MANAGEMENT:
			case OBJECT:
			case CONTEXT:
			case EXEMPT:
			case REDACTION:
			case POLICY:
			case DATABASE:
			case SYSTEM:
			case LINK:
			case ANALYZE:
			case DICTIONARY:
			case DIMENSION:
			case INDEXTYPE:
			case EXTERNAL:
			case JOB:
			case CLASS:
			case PROGRAM:
			case SCHEDULER:
			case LIBRARY:
			case LOGMINING:
			case MATERIALIZED:
			case CUBE:
			case MEASURE:
			case FOLDER:
			case BUILD:
			case PROCESS:
			case OPERATOR:
			case OUTLINE:
			case PLUGGABLE:
			case CONTAINER:
			case SEGMENT:
			case RESTRICTED:
			case COST:
			case BACKUP:
			case UNLIMITED:
			case BECOME:
			case CHANGE:
			case NOTIFICATION:
			case PRIVILEGE:
			case PURGE:
			case RESUMABLE:
			case SYSGUID:
			case SYSBACKUP:
			case SYSDBA:
			case SYSDG:
			case SYSKM:
			case SYSOPER:
			case DBA_RECYCLEBIN:
			case FIRST:
			case RANK:
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(1358);
				identifier();
				}
				break;
			case STRING_:
				enterOuterAlt(_localctx, 2);
				{
				setState(1359);
				stringLiterals();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValidTimeColumnContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public ValidTimeColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_validTimeColumn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterValidTimeColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitValidTimeColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitValidTimeColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValidTimeColumnContext validTimeColumn() throws RecognitionException {
		ValidTimeColumnContext _localctx = new ValidTimeColumnContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_validTimeColumn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1362);
			columnName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttrDimContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AttrDimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrDim; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterAttrDim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitAttrDim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitAttrDim(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttrDimContext attrDim() throws RecognitionException {
		AttrDimContext _localctx = new AttrDimContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_attrDim);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1364);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HierarchyNameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public OwnerContext owner() {
			return getRuleContext(OwnerContext.class,0);
		}
		public TerminalNode DOT_() { return getToken(BaseRuleParser.DOT_, 0); }
		public HierarchyNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hierarchyName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterHierarchyName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitHierarchyName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitHierarchyName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HierarchyNameContext hierarchyName() throws RecognitionException {
		HierarchyNameContext _localctx = new HierarchyNameContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_hierarchyName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1369);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				{
				setState(1366);
				owner();
				setState(1367);
				match(DOT_);
				}
				break;
			}
			setState(1371);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnalyticViewNameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public OwnerContext owner() {
			return getRuleContext(OwnerContext.class,0);
		}
		public TerminalNode DOT_() { return getToken(BaseRuleParser.DOT_, 0); }
		public AnalyticViewNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_analyticViewName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterAnalyticViewName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitAnalyticViewName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitAnalyticViewName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnalyticViewNameContext analyticViewName() throws RecognitionException {
		AnalyticViewNameContext _localctx = new AnalyticViewNameContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_analyticViewName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				{
				setState(1373);
				owner();
				setState(1374);
				match(DOT_);
				}
				break;
			}
			setState(1378);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SamplePercentContext extends ParserRuleContext {
		public NumberLiteralsContext numberLiterals() {
			return getRuleContext(NumberLiteralsContext.class,0);
		}
		public SamplePercentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_samplePercent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterSamplePercent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitSamplePercent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitSamplePercent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SamplePercentContext samplePercent() throws RecognitionException {
		SamplePercentContext _localctx = new SamplePercentContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_samplePercent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1380);
			numberLiterals();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SeedValueContext extends ParserRuleContext {
		public NumberLiteralsContext numberLiterals() {
			return getRuleContext(NumberLiteralsContext.class,0);
		}
		public SeedValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seedValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterSeedValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitSeedValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitSeedValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeedValueContext seedValue() throws RecognitionException {
		SeedValueContext _localctx = new SeedValueContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_seedValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1382);
			numberLiterals();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespaceContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitNamespace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceContext namespace() throws RecognitionException {
		NamespaceContext _localctx = new NamespaceContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_namespace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1384);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 73:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 76:
			return booleanPrimary_sempred((BooleanPrimaryContext)_localctx, predIndex);
		case 79:
			return bitExpr_sempred((BitExprContext)_localctx, predIndex);
		case 80:
			return simpleExpr_sempred((SimpleExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean booleanPrimary_sempred(BooleanPrimaryContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean bitExpr_sempred(BitExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 11);
		case 6:
			return precpred(_ctx, 10);
		case 7:
			return precpred(_ctx, 9);
		case 8:
			return precpred(_ctx, 8);
		case 9:
			return precpred(_ctx, 7);
		case 10:
			return precpred(_ctx, 6);
		case 11:
			return precpred(_ctx, 5);
		case 12:
			return precpred(_ctx, 4);
		case 13:
			return precpred(_ctx, 3);
		case 14:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean simpleExpr_sempred(SimpleExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0307\u056d\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\5\3\u0172\n\3\3\4\3\4\3\5\5\5\u0177\n\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\5\6\u0182\n\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\5"+
		"\13\u018e\n\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\5\16\u0197\n\16\3\16\3\16"+
		"\3\17\3\17\3\17\5\17\u019e\n\17\3\17\3\17\3\20\3\20\3\20\5\20\u01a5\n"+
		"\20\3\20\3\20\3\21\3\21\3\21\5\21\u01ac\n\21\3\21\3\21\3\22\3\22\3\22"+
		"\5\22\u01b3\n\22\3\22\3\22\3\23\3\23\3\23\5\23\u01ba\n\23\3\23\3\23\3"+
		"\24\3\24\3\24\5\24\u01c1\n\24\3\24\3\24\3\25\3\25\3\25\5\25\u01c8\n\25"+
		"\3\25\3\25\3\26\3\26\3\26\5\26\u01cf\n\26\3\26\3\26\3\27\3\27\3\27\5\27"+
		"\u01d6\n\27\3\27\3\27\3\30\3\30\3\30\5\30\u01dd\n\30\3\30\3\30\3\31\3"+
		"\31\3\31\5\31\u01e4\n\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35"+
		"\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&"+
		"\5&\u0202\n&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3"+
		"\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3"+
		"\67\3\67\38\38\39\39\59\u022a\n9\3:\3:\5:\u022e\n:\3;\3;\3<\3<\3=\3=\3"+
		">\3>\3?\3?\3@\3@\3A\5A\u023d\nA\3A\3A\3A\7A\u0242\nA\fA\16A\u0245\13A"+
		"\3A\5A\u0248\nA\3B\5B\u024b\nB\3B\3B\3B\7B\u0250\nB\fB\16B\u0253\13B\3"+
		"B\5B\u0256\nB\3C\3C\3C\7C\u025b\nC\fC\16C\u025e\13C\3C\5C\u0261\nC\3D"+
		"\3D\3E\3E\3F\3F\5F\u0269\nF\3G\3G\3G\3G\5G\u026f\nG\5G\u0271\nG\3G\3G"+
		"\3H\5H\u0276\nH\3H\3H\3I\3I\3I\7I\u027d\nI\fI\16I\u0280\13I\3J\3J\3J\3"+
		"J\3K\3K\3K\3K\3K\3K\3K\3K\3K\5K\u028f\nK\3K\3K\3K\3K\7K\u0295\nK\fK\16"+
		"K\u0298\13K\3L\3L\3M\3M\3N\3N\3N\3N\3N\3N\5N\u02a4\nN\3N\3N\3N\3N\3N\3"+
		"N\3N\3N\3N\3N\3N\3N\3N\7N\u02b3\nN\fN\16N\u02b6\13N\3O\3O\3P\3P\5P\u02bc"+
		"\nP\3P\3P\3P\3P\3P\5P\u02c3\nP\3P\3P\3P\3P\3P\7P\u02ca\nP\fP\16P\u02cd"+
		"\13P\3P\3P\3P\3P\5P\u02d3\nP\3P\3P\3P\3P\3P\7P\u02da\nP\fP\16P\u02dd\13"+
		"P\3P\3P\3P\3P\3P\3P\5P\u02e5\nP\3P\3P\3P\3P\3P\3P\3P\5P\u02ee\nP\3P\3"+
		"P\3P\3P\5P\u02f4\nP\3P\5P\u02f7\nP\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3"+
		"Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\7Q\u031a"+
		"\nQ\fQ\16Q\u031d\13Q\3R\3R\3R\3R\3R\3R\3R\3R\5R\u0327\nR\3R\3R\3R\3R\7"+
		"R\u032d\nR\fR\16R\u0330\13R\3R\3R\3R\5R\u0335\nR\3R\3R\3R\3R\3R\3R\3R"+
		"\3R\5R\u033f\nR\3R\3R\3R\7R\u0344\nR\fR\16R\u0347\13R\3S\3S\3S\5S\u034c"+
		"\nS\3T\3T\3T\5T\u0351\nT\3T\3T\3T\7T\u0356\nT\fT\16T\u0359\13T\3T\5T\u035c"+
		"\nT\3T\3T\3U\3U\3V\3V\3W\3W\5W\u0366\nW\3X\3X\3X\3X\3X\3X\3X\3Y\3Y\3Y"+
		"\3Y\3Y\7Y\u0374\nY\fY\16Y\u0377\13Y\3Y\3Y\5Y\u037b\nY\3Y\3Y\3Z\3Z\3Z\3"+
		"Z\3Z\7Z\u0384\nZ\fZ\16Z\u0387\13Z\3Z\5Z\u038a\nZ\3Z\3Z\3[\3[\3[\3[\3["+
		"\5[\u0393\n[\3\\\3\\\5\\\u0397\n\\\3\\\6\\\u039a\n\\\r\\\16\\\u039b\3"+
		"\\\5\\\u039f\n\\\3]\3]\3]\3]\3]\3^\3^\3^\3_\3_\3`\3`\5`\u03ad\n`\3`\3"+
		"`\3`\3`\7`\u03b3\n`\f`\16`\u03b6\13`\3a\3a\3a\5a\u03bb\na\3a\5a\u03be"+
		"\na\3a\3a\3a\3a\5a\u03c4\na\3b\3b\3c\3c\3c\7c\u03cb\nc\fc\16c\u03ce\13"+
		"c\3d\3d\5d\u03d2\nd\3e\3e\3e\7e\u03d7\ne\fe\16e\u03da\13e\3f\3f\3f\3f"+
		"\3g\3g\5g\u03e2\ng\3g\3g\3g\5g\u03e7\ng\3g\3g\5g\u03eb\ng\3h\3h\3h\3h"+
		"\3h\3h\3h\3h\3h\5h\u03f6\nh\3h\3h\3h\3h\3h\3h\5h\u03fe\nh\3h\3h\5h\u0402"+
		"\nh\5h\u0404\nh\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i"+
		"\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i"+
		"\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\5i\u0441\ni\3j"+
		"\3j\5j\u0445\nj\3j\3j\5j\u0449\nj\3j\3j\3j\3j\3j\3j\3j\5j\u0452\nj\5j"+
		"\u0454\nj\3k\3k\3k\3k\3k\5k\u045b\nk\3k\3k\3k\3l\3l\3l\3l\3l\5l\u0465"+
		"\nl\3m\3m\3m\5m\u046a\nm\3m\5m\u046d\nm\3m\3m\3n\3n\6n\u0473\nn\rn\16"+
		"n\u0474\3o\3o\3o\3o\3o\3p\3p\3p\3q\3q\3q\3q\3q\3q\3q\3q\3q\5q\u0488\n"+
		"q\3q\3q\3q\3q\3q\5q\u048f\nq\3q\3q\3q\3q\5q\u0495\nq\3q\3q\5q\u0499\n"+
		"q\3r\3r\3r\3r\3r\5r\u04a0\nr\3r\3r\3r\3r\7r\u04a6\nr\fr\16r\u04a9\13r"+
		"\3r\3r\5r\u04ad\nr\3r\5r\u04b0\nr\3s\3s\3s\3s\3t\3t\3u\3u\3u\7u\u04bb"+
		"\nu\fu\16u\u04be\13u\3v\3v\3w\3w\3x\3x\3y\3y\3z\3z\3{\3{\3|\3|\3}\3}\3"+
		"~\3~\3\177\3\177\3\u0080\3\u0080\3\u0081\3\u0081\3\u0082\3\u0082\3\u0083"+
		"\3\u0083\3\u0084\3\u0084\3\u0085\3\u0085\3\u0086\3\u0086\3\u0087\3\u0087"+
		"\3\u0088\3\u0088\3\u0089\3\u0089\3\u008a\3\u008a\3\u008a\3\u008a\5\u008a"+
		"\u04ec\n\u008a\3\u008b\3\u008b\3\u008c\3\u008c\3\u008d\3\u008d\3\u008e"+
		"\3\u008e\3\u008f\3\u008f\3\u0090\3\u0090\3\u0091\3\u0091\3\u0092\3\u0092"+
		"\3\u0093\3\u0093\3\u0094\3\u0094\3\u0095\3\u0095\3\u0096\3\u0096\3\u0097"+
		"\3\u0097\3\u0097\5\u0097\u0509\n\u0097\3\u0098\3\u0098\3\u0098\5\u0098"+
		"\u050e\n\u0098\3\u0099\3\u0099\3\u0099\5\u0099\u0513\n\u0099\3\u009a\3"+
		"\u009a\3\u009b\3\u009b\3\u009b\5\u009b\u051a\n\u009b\3\u009b\3\u009b\3"+
		"\u009c\3\u009c\3\u009d\3\u009d\3\u009e\3\u009e\3\u009f\3\u009f\3\u009f"+
		"\5\u009f\u0527\n\u009f\3\u009f\3\u009f\3\u00a0\3\u00a0\3\u00a0\5\u00a0"+
		"\u052e\n\u00a0\3\u00a0\3\u00a0\3\u00a1\3\u00a1\3\u00a2\3\u00a2\3\u00a3"+
		"\3\u00a3\5\u00a3\u0538\n\u00a3\3\u00a4\3\u00a4\3\u00a5\3\u00a5\3\u00a6"+
		"\3\u00a6\3\u00a6\5\u00a6\u0541\n\u00a6\3\u00a6\3\u00a6\3\u00a7\3\u00a7"+
		"\3\u00a8\3\u00a8\3\u00a9\3\u00a9\3\u00aa\3\u00aa\3\u00ab\3\u00ab\3\u00ac"+
		"\3\u00ac\3\u00ad\3\u00ad\5\u00ad\u0553\n\u00ad\3\u00ae\3\u00ae\3\u00af"+
		"\3\u00af\3\u00b0\3\u00b0\3\u00b0\5\u00b0\u055c\n\u00b0\3\u00b0\3\u00b0"+
		"\3\u00b1\3\u00b1\3\u00b1\5\u00b1\u0563\n\u00b1\3\u00b1\3\u00b1\3\u00b2"+
		"\3\u00b2\3\u00b3\3\u00b3\3\u00b4\3\u00b4\3\u00b4\2\6\u0094\u009a\u00a0"+
		"\u00a2\u00b5\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0"+
		"\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8"+
		"\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0"+
		"\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8"+
		"\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100"+
		"\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118"+
		"\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130"+
		"\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148"+
		"\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c\u015e\u0160"+
		"\u0162\u0164\u0166\2\20\3\2\17\20\3\2\u0304\u0305\4\2\u0084\u0085\u0087"+
		"\u0087\3\2jk)\2\65\66EEGGNRT\\``jkx\177\u0081\u0083\u0085\u0085\u0087"+
		"\u0097\u009a\u009b\u009e\u00aa\u00ac\u00ac\u00ae\u00ae\u00b6\u00b9\u00bc"+
		"\u00be\u00c0\u00c4\u00c6\u00c6\u00c8\u00dd\u00df\u00e6\u00e8\u00ea\u00ec"+
		"\u00ee\u00f0\u00f0\u00f3\u00fa\u00fc\u00fd\u00ff\u0102\u0104\u0104\u0106"+
		"\u0109\u010b\u010b\u010f\u0119\u011b\u011f\u0124\u0129\u012b\u0130\u0132"+
		"\u0136\u0138\u014b\u014d\u0151\u0153\u015d\u02c4\u02c4\3\2\u0302\u0303"+
		"\4\2\4\5ef\4\2\6\6hh\4\2ik\u00bc\u00bc\3\2op\3\2\30\35\5\2\6\7\17\20\u00b6"+
		"\u00b6\3\2\u0093\u0097\3\2uv\2\u0582\2\u0168\3\2\2\2\4\u0171\3\2\2\2\6"+
		"\u0173\3\2\2\2\b\u0176\3\2\2\2\n\u0181\3\2\2\2\f\u0183\3\2\2\2\16\u0185"+
		"\3\2\2\2\20\u0187\3\2\2\2\22\u0189\3\2\2\2\24\u018d\3\2\2\2\26\u018f\3"+
		"\2\2\2\30\u0191\3\2\2\2\32\u0196\3\2\2\2\34\u019d\3\2\2\2\36\u01a4\3\2"+
		"\2\2 \u01ab\3\2\2\2\"\u01b2\3\2\2\2$\u01b9\3\2\2\2&\u01c0\3\2\2\2(\u01c7"+
		"\3\2\2\2*\u01ce\3\2\2\2,\u01d5\3\2\2\2.\u01dc\3\2\2\2\60\u01e3\3\2\2\2"+
		"\62\u01e7\3\2\2\2\64\u01e9\3\2\2\2\66\u01eb\3\2\2\28\u01ed\3\2\2\2:\u01ef"+
		"\3\2\2\2<\u01f1\3\2\2\2>\u01f3\3\2\2\2@\u01f5\3\2\2\2B\u01f7\3\2\2\2D"+
		"\u01f9\3\2\2\2F\u01fb\3\2\2\2H\u01fd\3\2\2\2J\u0201\3\2\2\2L\u0203\3\2"+
		"\2\2N\u0205\3\2\2\2P\u0207\3\2\2\2R\u0209\3\2\2\2T\u020b\3\2\2\2V\u020d"+
		"\3\2\2\2X\u020f\3\2\2\2Z\u0211\3\2\2\2\\\u0213\3\2\2\2^\u0215\3\2\2\2"+
		"`\u0217\3\2\2\2b\u0219\3\2\2\2d\u021b\3\2\2\2f\u021d\3\2\2\2h\u021f\3"+
		"\2\2\2j\u0221\3\2\2\2l\u0223\3\2\2\2n\u0225\3\2\2\2p\u0229\3\2\2\2r\u022d"+
		"\3\2\2\2t\u022f\3\2\2\2v\u0231\3\2\2\2x\u0233\3\2\2\2z\u0235\3\2\2\2|"+
		"\u0237\3\2\2\2~\u0239\3\2\2\2\u0080\u023c\3\2\2\2\u0082\u024a\3\2\2\2"+
		"\u0084\u0260\3\2\2\2\u0086\u0262\3\2\2\2\u0088\u0264\3\2\2\2\u008a\u0268"+
		"\3\2\2\2\u008c\u026a\3\2\2\2\u008e\u0275\3\2\2\2\u0090\u0279\3\2\2\2\u0092"+
		"\u0281\3\2\2\2\u0094\u028e\3\2\2\2\u0096\u0299\3\2\2\2\u0098\u029b\3\2"+
		"\2\2\u009a\u029d\3\2\2\2\u009c\u02b7\3\2\2\2\u009e\u02f6\3\2\2\2\u00a0"+
		"\u02f8\3\2\2\2\u00a2\u033e\3\2\2\2\u00a4\u034b\3\2\2\2\u00a6\u034d\3\2"+
		"\2\2\u00a8\u035f\3\2\2\2\u00aa\u0361\3\2\2\2\u00ac\u0365\3\2\2\2\u00ae"+
		"\u0367\3\2\2\2\u00b0\u036e\3\2\2\2\u00b2\u037e\3\2\2\2\u00b4\u0392\3\2"+
		"\2\2\u00b6\u0394\3\2\2\2\u00b8\u03a0\3\2\2\2\u00ba\u03a5\3\2\2\2\u00bc"+
		"\u03a8\3\2\2\2\u00be\u03aa\3\2\2\2\u00c0\u03ba\3\2\2\2\u00c2\u03c5\3\2"+
		"\2\2\u00c4\u03c7\3\2\2\2\u00c6\u03d1\3\2\2\2\u00c8\u03d3\3\2\2\2\u00ca"+
		"\u03db\3\2\2\2\u00cc\u03ea\3\2\2\2\u00ce\u0403\3\2\2\2\u00d0\u0440\3\2"+
		"\2\2\u00d2\u0453\3\2\2\2\u00d4\u0455\3\2\2\2\u00d6\u0464\3\2\2\2\u00d8"+
		"\u0466\3\2\2\2\u00da\u0470\3\2\2\2\u00dc\u0476\3\2\2\2\u00de\u047b\3\2"+
		"\2\2\u00e0\u047e\3\2\2\2\u00e2\u049f\3\2\2\2\u00e4\u04b1\3\2\2\2\u00e6"+
		"\u04b5\3\2\2\2\u00e8\u04b7\3\2\2\2\u00ea\u04bf\3\2\2\2\u00ec\u04c1\3\2"+
		"\2\2\u00ee\u04c3\3\2\2\2\u00f0\u04c5\3\2\2\2\u00f2\u04c7\3\2\2\2\u00f4"+
		"\u04c9\3\2\2\2\u00f6\u04cb\3\2\2\2\u00f8\u04cd\3\2\2\2\u00fa\u04cf\3\2"+
		"\2\2\u00fc\u04d1\3\2\2\2\u00fe\u04d3\3\2\2\2\u0100\u04d5\3\2\2\2\u0102"+
		"\u04d7\3\2\2\2\u0104\u04d9\3\2\2\2\u0106\u04db\3\2\2\2\u0108\u04dd\3\2"+
		"\2\2\u010a\u04df\3\2\2\2\u010c\u04e1\3\2\2\2\u010e\u04e3\3\2\2\2\u0110"+
		"\u04e5\3\2\2\2\u0112\u04eb\3\2\2\2\u0114\u04ed\3\2\2\2\u0116\u04ef\3\2"+
		"\2\2\u0118\u04f1\3\2\2\2\u011a\u04f3\3\2\2\2\u011c\u04f5\3\2\2\2\u011e"+
		"\u04f7\3\2\2\2\u0120\u04f9\3\2\2\2\u0122\u04fb\3\2\2\2\u0124\u04fd\3\2"+
		"\2\2\u0126\u04ff\3\2\2\2\u0128\u0501\3\2\2\2\u012a\u0503\3\2\2\2\u012c"+
		"\u0508\3\2\2\2\u012e\u050d\3\2\2\2\u0130\u0512\3\2\2\2\u0132\u0514\3\2"+
		"\2\2\u0134\u0519\3\2\2\2\u0136\u051d\3\2\2\2\u0138\u051f\3\2\2\2\u013a"+
		"\u0521\3\2\2\2\u013c\u0526\3\2\2\2\u013e\u052d\3\2\2\2\u0140\u0531\3\2"+
		"\2\2\u0142\u0533\3\2\2\2\u0144\u0537\3\2\2\2\u0146\u0539\3\2\2\2\u0148"+
		"\u053b\3\2\2\2\u014a\u0540\3\2\2\2\u014c\u0544\3\2\2\2\u014e\u0546\3\2"+
		"\2\2\u0150\u0548\3\2\2\2\u0152\u054a\3\2\2\2\u0154\u054c\3\2\2\2\u0156"+
		"\u054e\3\2\2\2\u0158\u0552\3\2\2\2\u015a\u0554\3\2\2\2\u015c\u0556\3\2"+
		"\2\2\u015e\u055b\3\2\2\2\u0160\u0562\3\2\2\2\u0162\u0566\3\2\2\2\u0164"+
		"\u0568\3\2\2\2\u0166\u056a\3\2\2\2\u0168\u0169\7)\2\2\u0169\3\3\2\2\2"+
		"\u016a\u0172\5\6\4\2\u016b\u0172\5\b\5\2\u016c\u0172\5\n\6\2\u016d\u0172"+
		"\5\f\7\2\u016e\u0172\5\16\b\2\u016f\u0172\5\20\t\2\u0170\u0172\5\22\n"+
		"\2\u0171\u016a\3\2\2\2\u0171\u016b\3\2\2\2\u0171\u016c\3\2\2\2\u0171\u016d"+
		"\3\2\2\2\u0171\u016e\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0170\3\2\2\2\u0172"+
		"\5\3\2\2\2\u0173\u0174\7\u0303\2\2\u0174\7\3\2\2\2\u0175\u0177\t\2\2\2"+
		"\u0176\u0175\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0179"+
		"\t\3\2\2\u0179\t\3\2\2\2\u017a\u017b\t\4\2\2\u017b\u0182\7\u0303\2\2\u017c"+
		"\u017d\7!\2\2\u017d\u017e\5\24\13\2\u017e\u017f\7\u0303\2\2\u017f\u0180"+
		"\7\"\2\2\u0180\u0182\3\2\2\2\u0181\u017a\3\2\2\2\u0181\u017c\3\2\2\2\u0182"+
		"\13\3\2\2\2\u0183\u0184\7\u0306\2\2\u0184\r\3\2\2\2\u0185\u0186\7\u0307"+
		"\2\2\u0186\17\3\2\2\2\u0187\u0188\t\5\2\2\u0188\21\3\2\2\2\u0189\u018a"+
		"\7i\2\2\u018a\23\3\2\2\2\u018b\u018e\7\u0302\2\2\u018c\u018e\5\26\f\2"+
		"\u018d\u018b\3\2\2\2\u018d\u018c\3\2\2\2\u018e\25\3\2\2\2\u018f\u0190"+
		"\t\6\2\2\u0190\27\3\2\2\2\u0191\u0192\5\24\13\2\u0192\31\3\2\2\2\u0193"+
		"\u0194\58\35\2\u0194\u0195\7\24\2\2\u0195\u0197\3\2\2\2\u0196\u0193\3"+
		"\2\2\2\u0196\u0197\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u0199\5:\36\2\u0199"+
		"\33\3\2\2\2\u019a\u019b\58\35\2\u019b\u019c\7\24\2\2\u019c\u019e\3\2\2"+
		"\2\u019d\u019a\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a0"+
		"\5:\36\2\u01a0\35\3\2\2\2\u01a1\u01a2\58\35\2\u01a2\u01a3\7\24\2\2\u01a3"+
		"\u01a5\3\2\2\2\u01a4\u01a1\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a6\3\2"+
		"\2\2\u01a6\u01a7\5:\36\2\u01a7\37\3\2\2\2\u01a8\u01a9\58\35\2\u01a9\u01aa"+
		"\7\24\2\2\u01aa\u01ac\3\2\2\2\u01ab\u01a8\3\2\2\2\u01ab\u01ac\3\2\2\2"+
		"\u01ac\u01ad\3\2\2\2\u01ad\u01ae\5:\36\2\u01ae!\3\2\2\2\u01af\u01b0\5"+
		"8\35\2\u01b0\u01b1\7\24\2\2\u01b1\u01b3\3\2\2\2\u01b2\u01af\3\2\2\2\u01b2"+
		"\u01b3\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b5\5:\36\2\u01b5#\3\2\2\2"+
		"\u01b6\u01b7\58\35\2\u01b7\u01b8\7\24\2\2\u01b8\u01ba\3\2\2\2\u01b9\u01b6"+
		"\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bc\5:\36\2\u01bc"+
		"%\3\2\2\2\u01bd\u01be\58\35\2\u01be\u01bf\7\24\2\2\u01bf\u01c1\3\2\2\2"+
		"\u01c0\u01bd\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c3"+
		"\5:\36\2\u01c3\'\3\2\2\2\u01c4\u01c5\58\35\2\u01c5\u01c6\7\24\2\2\u01c6"+
		"\u01c8\3\2\2\2\u01c7\u01c4\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01c9\3\2"+
		"\2\2\u01c9\u01ca\5:\36\2\u01ca)\3\2\2\2\u01cb\u01cc\58\35\2\u01cc\u01cd"+
		"\7\24\2\2\u01cd\u01cf\3\2\2\2\u01ce\u01cb\3\2\2\2\u01ce\u01cf\3\2\2\2"+
		"\u01cf\u01d0\3\2\2\2\u01d0\u01d1\5:\36\2\u01d1+\3\2\2\2\u01d2\u01d3\5"+
		"8\35\2\u01d3\u01d4\7\24\2\2\u01d4\u01d6\3\2\2\2\u01d5\u01d2\3\2\2\2\u01d5"+
		"\u01d6\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d8\5:\36\2\u01d8-\3\2\2\2"+
		"\u01d9\u01da\58\35\2\u01da\u01db\7\24\2\2\u01db\u01dd\3\2\2\2\u01dc\u01d9"+
		"\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01df\5:\36\2\u01df"+
		"/\3\2\2\2\u01e0\u01e1\58\35\2\u01e1\u01e2\7\24\2\2\u01e2\u01e4\3\2\2\2"+
		"\u01e3\u01e0\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e6"+
		"\5:\36\2\u01e6\61\3\2\2\2\u01e7\u01e8\5\24\13\2\u01e8\63\3\2\2\2\u01e9"+
		"\u01ea\5\24\13\2\u01ea\65\3\2\2\2\u01eb\u01ec\5\24\13\2\u01ec\67\3\2\2"+
		"\2\u01ed\u01ee\5\24\13\2\u01ee9\3\2\2\2\u01ef\u01f0\5\24\13\2\u01f0;\3"+
		"\2\2\2\u01f1\u01f2\5\24\13\2\u01f2=\3\2\2\2\u01f3\u01f4\5\24\13\2\u01f4"+
		"?\3\2\2\2\u01f5\u01f6\5\24\13\2\u01f6A\3\2\2\2\u01f7\u01f8\5\24\13\2\u01f8"+
		"C\3\2\2\2\u01f9\u01fa\5\24\13\2\u01faE\3\2\2\2\u01fb\u01fc\5\24\13\2\u01fc"+
		"G\3\2\2\2\u01fd\u01fe\5\24\13\2\u01feI\3\2\2\2\u01ff\u0202\5\4\3\2\u0200"+
		"\u0202\5\24\13\2\u0201\u01ff\3\2\2\2\u0201\u0200\3\2\2\2\u0202K\3\2\2"+
		"\2\u0203\u0204\5\24\13\2\u0204M\3\2\2\2\u0205\u0206\5\6\4\2\u0206O\3\2"+
		"\2\2\u0207\u0208\5\6\4\2\u0208Q\3\2\2\2\u0209\u020a\5\24\13\2\u020aS\3"+
		"\2\2\2\u020b\u020c\5\24\13\2\u020cU\3\2\2\2\u020d\u020e\5\24\13\2\u020e"+
		"W\3\2\2\2\u020f\u0210\5\24\13\2\u0210Y\3\2\2\2\u0211\u0212\5\24\13\2\u0212"+
		"[\3\2\2\2\u0213\u0214\5\24\13\2\u0214]\3\2\2\2\u0215\u0216\5\24\13\2\u0216"+
		"_\3\2\2\2\u0217\u0218\5\24\13\2\u0218a\3\2\2\2\u0219\u021a\5\24\13\2\u021a"+
		"c\3\2\2\2\u021b\u021c\5\24\13\2\u021ce\3\2\2\2\u021d\u021e\5\24\13\2\u021e"+
		"g\3\2\2\2\u021f\u0220\5\24\13\2\u0220i\3\2\2\2\u0221\u0222\5\24\13\2\u0222"+
		"k\3\2\2\2\u0223\u0224\5\24\13\2\u0224m\3\2\2\2\u0225\u0226\5\24\13\2\u0226"+
		"o\3\2\2\2\u0227\u022a\7\u0304\2\2\u0228\u022a\5\n\6\2\u0229\u0227\3\2"+
		"\2\2\u0229\u0228\3\2\2\2\u022aq\3\2\2\2\u022b\u022e\7\u0304\2\2\u022c"+
		"\u022e\5\n\6\2\u022d\u022b\3\2\2\2\u022d\u022c\3\2\2\2\u022es\3\2\2\2"+
		"\u022f\u0230\5\24\13\2\u0230u\3\2\2\2\u0231\u0232\5\24\13\2\u0232w\3\2"+
		"\2\2\u0233\u0234\5\24\13\2\u0234y\3\2\2\2\u0235\u0236\5\24\13\2\u0236"+
		"{\3\2\2\2\u0237\u0238\5\24\13\2\u0238}\3\2\2\2\u0239\u023a\5\24\13\2\u023a"+
		"\177\3\2\2\2\u023b\u023d\7\37\2\2\u023c\u023b\3\2\2\2\u023c\u023d\3\2"+
		"\2\2\u023d\u023e\3\2\2\2\u023e\u0243\5 \21\2\u023f\u0240\7%\2\2\u0240"+
		"\u0242\5 \21\2\u0241\u023f\3\2\2\2\u0242\u0245\3\2\2\2\u0243\u0241\3\2"+
		"\2\2\u0243\u0244\3\2\2\2\u0244\u0247\3\2\2\2\u0245\u0243\3\2\2\2\u0246"+
		"\u0248\7 \2\2\u0247\u0246\3\2\2\2\u0247\u0248\3\2\2\2\u0248\u0081\3\2"+
		"\2\2\u0249\u024b\7\37\2\2\u024a\u0249\3\2\2\2\u024a\u024b\3\2\2\2\u024b"+
		"\u024c\3\2\2\2\u024c\u0251\5\32\16\2\u024d\u024e\7%\2\2\u024e\u0250\5"+
		"\32\16\2\u024f\u024d\3\2\2\2\u0250\u0253\3\2\2\2\u0251\u024f\3\2\2\2\u0251"+
		"\u0252\3\2\2\2\u0252\u0255\3\2\2\2\u0253\u0251\3\2\2\2\u0254\u0256\7 "+
		"\2\2\u0255\u0254\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u0083\3\2\2\2\u0257"+
		"\u0261\5\24\13\2\u0258\u0259\7\u0303\2\2\u0259\u025b\7\24\2\2\u025a\u0258"+
		"\3\2\2\2\u025b\u025e\3\2\2\2\u025c\u025a\3\2\2\2\u025c\u025d\3\2\2\2\u025d"+
		"\u025f\3\2\2\2\u025e\u025c\3\2\2\2\u025f\u0261\7\u0303\2\2\u0260\u0257"+
		"\3\2\2\2\u0260\u025c\3\2\2\2\u0261\u0085\3\2\2\2\u0262\u0263\t\7\2\2\u0263"+
		"\u0087\3\2\2\2\u0264\u0265\5\24\13\2\u0265\u0089\3\2\2\2\u0266\u0269\5"+
		"\24\13\2\u0267\u0269\7\u0303\2\2\u0268\u0266\3\2\2\2\u0268\u0267\3\2\2"+
		"\2\u0269\u008b\3\2\2\2\u026a\u0270\7\37\2\2\u026b\u026e\7\u0304\2\2\u026c"+
		"\u026d\7%\2\2\u026d\u026f\7\u0304\2\2\u026e\u026c\3\2\2\2\u026e\u026f"+
		"\3\2\2\2\u026f\u0271\3\2\2\2\u0270\u026b\3\2\2\2\u0270\u0271\3\2\2\2\u0271"+
		"\u0272\3\2\2\2\u0272\u0273\7 \2\2\u0273\u008d\3\2\2\2\u0274\u0276\7?\2"+
		"\2\u0275\u0274\3\2\2\2\u0275\u0276\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u0278"+
		"\7B\2\2\u0278\u008f\3\2\2\2\u0279\u027e\5\u0094K\2\u027a\u027b\7%\2\2"+
		"\u027b\u027d\5\u0094K\2\u027c\u027a\3\2\2\2\u027d\u0280\3\2\2\2\u027e"+
		"\u027c\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u0091\3\2\2\2\u0280\u027e\3\2"+
		"\2\2\u0281\u0282\7\37\2\2\u0282\u0283\5\u0090I\2\u0283\u0284\7 \2\2\u0284"+
		"\u0093\3\2\2\2\u0285\u0286\bK\1\2\u0286\u0287\5\u0098M\2\u0287\u0288\5"+
		"\u0094K\5\u0288\u028f\3\2\2\2\u0289\u028a\7\37\2\2\u028a\u028b\5\u0094"+
		"K\2\u028b\u028c\7 \2\2\u028c\u028f\3\2\2\2\u028d\u028f\5\u009aN\2\u028e"+
		"\u0285\3\2\2\2\u028e\u0289\3\2\2\2\u028e\u028d\3\2\2\2\u028f\u0296\3\2"+
		"\2\2\u0290\u0291\f\6\2\2\u0291\u0292\5\u0096L\2\u0292\u0293\5\u0094K\7"+
		"\u0293\u0295\3\2\2\2\u0294\u0290\3\2\2\2\u0295\u0298\3\2\2\2\u0296\u0294"+
		"\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u0095\3\2\2\2\u0298\u0296\3\2\2\2\u0299"+
		"\u029a\t\b\2\2\u029a\u0097\3\2\2\2\u029b\u029c\t\t\2\2\u029c\u0099\3\2"+
		"\2\2\u029d\u029e\bN\1\2\u029e\u029f\5\u009eP\2\u029f\u02b4\3\2\2\2\u02a0"+
		"\u02a1\f\7\2\2\u02a1\u02a3\7g\2\2\u02a2\u02a4\7h\2\2\u02a3\u02a2\3\2\2"+
		"\2\u02a3\u02a4\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5\u02b3\t\n\2\2\u02a6\u02a7"+
		"\f\6\2\2\u02a7\u02a8\7\26\2\2\u02a8\u02b3\5\u009eP\2\u02a9\u02aa\f\5\2"+
		"\2\u02aa\u02ab\5\u009cO\2\u02ab\u02ac\5\u009eP\2\u02ac\u02b3\3\2\2\2\u02ad"+
		"\u02ae\f\4\2\2\u02ae\u02af\5\u009cO\2\u02af\u02b0\t\13\2\2\u02b0\u02b1"+
		"\5\u00bc_\2\u02b1\u02b3\3\2\2\2\u02b2\u02a0\3\2\2\2\u02b2\u02a6\3\2\2"+
		"\2\u02b2\u02a9\3\2\2\2\u02b2\u02ad\3\2\2\2\u02b3\u02b6\3\2\2\2\u02b4\u02b2"+
		"\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\u009b\3\2\2\2\u02b6\u02b4\3\2\2\2\u02b7"+
		"\u02b8\t\f\2\2\u02b8\u009d\3\2\2\2\u02b9\u02bb\5\u00a0Q\2\u02ba\u02bc"+
		"\7h\2\2\u02bb\u02ba\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd"+
		"\u02be\7n\2\2\u02be\u02bf\5\u00bc_\2\u02bf\u02f7\3\2\2\2\u02c0\u02c2\5"+
		"\u00a0Q\2\u02c1\u02c3\7h\2\2\u02c2\u02c1\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3"+
		"\u02c4\3\2\2\2\u02c4\u02c5\7n\2\2\u02c5\u02c6\7\37\2\2\u02c6\u02cb\5\u0094"+
		"K\2\u02c7\u02c8\7%\2\2\u02c8\u02ca\5\u0094K\2\u02c9\u02c7\3\2\2\2\u02ca"+
		"\u02cd\3\2\2\2\u02cb\u02c9\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc\u02ce\3\2"+
		"\2\2\u02cd\u02cb\3\2\2\2\u02ce\u02cf\7 \2\2\u02cf\u02f7\3\2\2\2\u02d0"+
		"\u02d2\5\u00a0Q\2\u02d1\u02d3\7h\2\2\u02d2\u02d1\3\2\2\2\u02d2\u02d3\3"+
		"\2\2\2\u02d3\u02d4\3\2\2\2\u02d4\u02d5\7n\2\2\u02d5\u02d6\7\37\2\2\u02d6"+
		"\u02db\5\u0094K\2\u02d7\u02d8\7%\2\2\u02d8\u02da\5\u0094K\2\u02d9\u02d7"+
		"\3\2\2\2\u02da\u02dd\3\2\2\2\u02db\u02d9\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc"+
		"\u02de\3\2\2\2\u02dd\u02db\3\2\2\2\u02de\u02df\7 \2\2\u02df\u02e0\7e\2"+
		"\2\u02e0\u02e1\5\u009eP\2\u02e1\u02f7\3\2\2\2\u02e2\u02e4\5\u00a0Q\2\u02e3"+
		"\u02e5\7h\2\2\u02e4\u02e3\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5\u02e6\3\2"+
		"\2\2\u02e6\u02e7\7m\2\2\u02e7\u02e8\5\u00a0Q\2\u02e8\u02e9\7e\2\2\u02e9"+
		"\u02ea\5\u009eP\2\u02ea\u02f7\3\2\2\2\u02eb\u02ed\5\u00a0Q\2\u02ec\u02ee"+
		"\7h\2\2\u02ed\u02ec\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee\u02ef\3\2\2\2\u02ef"+
		"\u02f0\7q\2\2\u02f0\u02f3\5\u00a2R\2\u02f1\u02f2\7\u00b7\2\2\u02f2\u02f4"+
		"\5\u00a2R\2\u02f3\u02f1\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4\u02f7\3\2\2"+
		"\2\u02f5\u02f7\5\u00a0Q\2\u02f6\u02b9\3\2\2\2\u02f6\u02c0\3\2\2\2\u02f6"+
		"\u02d0\3\2\2\2\u02f6\u02e2\3\2\2\2\u02f6\u02eb\3\2\2\2\u02f6\u02f5\3\2"+
		"\2\2\u02f7\u009f\3\2\2\2\u02f8\u02f9\bQ\1\2\u02f9\u02fa\5\u00a2R\2\u02fa"+
		"\u031b\3\2\2\2\u02fb\u02fc\f\r\2\2\u02fc\u02fd\7\b\2\2\u02fd\u031a\5\u00a0"+
		"Q\16\u02fe\u02ff\f\f\2\2\u02ff\u0300\7\t\2\2\u0300\u031a\5\u00a0Q\r\u0301"+
		"\u0302\f\13\2\2\u0302\u0303\7\n\2\2\u0303\u031a\5\u00a0Q\f\u0304\u0305"+
		"\f\n\2\2\u0305\u0306\7\13\2\2\u0306\u031a\5\u00a0Q\13\u0307\u0308\f\t"+
		"\2\2\u0308\u0309\7\17\2\2\u0309\u031a\5\u00a0Q\n\u030a\u030b\f\b\2\2\u030b"+
		"\u030c\7\20\2\2\u030c\u031a\5\u00a0Q\t\u030d\u030e\f\7\2\2\u030e\u030f"+
		"\7\21\2\2\u030f\u031a\5\u00a0Q\b\u0310\u0311\f\6\2\2\u0311\u0312\7\22"+
		"\2\2\u0312\u031a\5\u00a0Q\7\u0313\u0314\f\5\2\2\u0314\u0315\7\r\2\2\u0315"+
		"\u031a\5\u00a0Q\6\u0316\u0317\f\4\2\2\u0317\u0318\7\f\2\2\u0318\u031a"+
		"\5\u00a0Q\5\u0319\u02fb\3\2\2\2\u0319\u02fe\3\2\2\2\u0319\u0301\3\2\2"+
		"\2\u0319\u0304\3\2\2\2\u0319\u0307\3\2\2\2\u0319\u030a\3\2\2\2\u0319\u030d"+
		"\3\2\2\2\u0319\u0310\3\2\2\2\u0319\u0313\3\2\2\2\u0319\u0316\3\2\2\2\u031a"+
		"\u031d\3\2\2\2\u031b\u0319\3\2\2\2\u031b\u031c\3\2\2\2\u031c\u00a1\3\2"+
		"\2\2\u031d\u031b\3\2\2\2\u031e\u031f\bR\1\2\u031f\u033f\5\u00a4S\2\u0320"+
		"\u033f\5\2\2\2\u0321\u033f\5\4\3\2\u0322\u033f\5 \21\2\u0323\u0324\t\r"+
		"\2\2\u0324\u033f\5\u00a2R\b\u0325\u0327\7\u00ba\2\2\u0326\u0325\3\2\2"+
		"\2\u0326\u0327\3\2\2\2\u0327\u0328\3\2\2\2\u0328\u0329\7\37\2\2\u0329"+
		"\u032e\5\u0094K\2\u032a\u032b\7%\2\2\u032b\u032d\5\u0094K\2\u032c\u032a"+
		"\3\2\2\2\u032d\u0330\3\2\2\2\u032e\u032c\3\2\2\2\u032e\u032f\3\2\2\2\u032f"+
		"\u0331\3\2\2\2\u0330\u032e\3\2\2\2\u0331\u0332\7 \2\2\u0332\u033f\3\2"+
		"\2\2\u0333\u0335\7l\2\2\u0334\u0333\3\2\2\2\u0334\u0335\3\2\2\2\u0335"+
		"\u0336\3\2\2\2\u0336\u033f\5\u00bc_\2\u0337\u0338\7!\2\2\u0338\u0339\5"+
		"\24\13\2\u0339\u033a\5\u0094K\2\u033a\u033b\7\"\2\2\u033b\u033f\3\2\2"+
		"\2\u033c\u033f\5\u00b6\\\2\u033d\u033f\5\u00d6l\2\u033e\u031e\3\2\2\2"+
		"\u033e\u0320\3\2\2\2\u033e\u0321\3\2\2\2\u033e\u0322\3\2\2\2\u033e\u0323"+
		"\3\2\2\2\u033e\u0326\3\2\2\2\u033e\u0334\3\2\2\2\u033e\u0337\3\2\2\2\u033e"+
		"\u033c\3\2\2\2\u033e\u033d\3\2\2\2\u033f\u0345\3\2\2\2\u0340\u0341\f\t"+
		"\2\2\u0341\u0342\7\5\2\2\u0342\u0344\5\u00a2R\n\u0343\u0340\3\2\2\2\u0344"+
		"\u0347\3\2\2\2\u0345\u0343\3\2\2\2\u0345\u0346\3\2\2\2\u0346\u00a3\3\2"+
		"\2\2\u0347\u0345\3\2\2\2\u0348\u034c\5\u00a6T\2\u0349\u034c\5\u00acW\2"+
		"\u034a\u034c\5\u00b2Z\2\u034b\u0348\3\2\2\2\u034b\u0349\3\2\2\2\u034b"+
		"\u034a\3\2\2\2\u034c\u00a5\3\2\2\2\u034d\u034e\5\u00a8U\2\u034e\u0350"+
		"\7\37\2\2\u034f\u0351\5\u00aaV\2\u0350\u034f\3\2\2\2\u0350\u0351\3\2\2"+
		"\2\u0351\u035b\3\2\2\2\u0352\u0357\5\u0094K\2\u0353\u0354\7%\2\2\u0354"+
		"\u0356\5\u0094K\2\u0355\u0353\3\2\2\2\u0356\u0359\3\2\2\2\u0357\u0355"+
		"\3\2\2\2\u0357\u0358\3\2\2\2\u0358\u035c\3\2\2\2\u0359\u0357\3\2\2\2\u035a"+
		"\u035c\7\21\2\2\u035b\u0352\3\2\2\2\u035b\u035a\3\2\2\2\u035b\u035c\3"+
		"\2\2\2\u035c\u035d\3\2\2\2\u035d\u035e\7 \2\2\u035e\u00a7\3\2\2\2\u035f"+
		"\u0360\t\16\2\2\u0360\u00a9\3\2\2\2\u0361\u0362\7M\2\2\u0362\u00ab\3\2"+
		"\2\2\u0363\u0366\5\u00aeX\2\u0364\u0366\5\u00b0Y\2\u0365\u0363\3\2\2\2"+
		"\u0365\u0364\3\2\2\2\u0366\u00ad\3\2\2\2\u0367\u0368\7P\2\2\u0368\u0369"+
		"\7\37\2\2\u0369\u036a\5\u0094K\2\u036a\u036b\7^\2\2\u036b\u036c\5\u00cc"+
		"g\2\u036c\u036d\7 \2\2\u036d\u00af\3\2\2\2\u036e\u036f\7\u0080\2\2\u036f"+
		"\u0370\7\37\2\2\u0370\u0375\5\u0094K\2\u0371\u0372\7%\2\2\u0372\u0374"+
		"\5\u0094K\2\u0373\u0371\3\2\2\2\u0374\u0377\3\2\2\2\u0375\u0373\3\2\2"+
		"\2\u0375\u0376\3\2\2\2\u0376\u037a\3\2\2\2\u0377\u0375\3\2\2\2\u0378\u0379"+
		"\7\\\2\2\u0379\u037b\5\u00e6t\2\u037a\u0378\3\2\2\2\u037a\u037b\3\2\2"+
		"\2\u037b\u037c\3\2\2\2\u037c\u037d\7 \2\2\u037d\u00b1\3\2\2\2\u037e\u037f"+
		"\5\u00b4[\2\u037f\u0389\7\37\2\2\u0380\u0385\5\u0094K\2\u0381\u0382\7"+
		"%\2\2\u0382\u0384\5\u0094K\2\u0383\u0381\3\2\2\2\u0384\u0387\3\2\2\2\u0385"+
		"\u0383\3\2\2\2\u0385\u0386\3\2\2\2\u0386\u038a\3\2\2\2\u0387\u0385\3\2"+
		"\2\2\u0388\u038a\7\21\2\2\u0389\u0380\3\2\2\2\u0389\u0388\3\2\2\2\u0389"+
		"\u038a\3\2\2\2\u038a\u038b\3\2\2\2\u038b\u038c\7 \2\2\u038c\u00b3\3\2"+
		"\2\2\u038d\u0393\5\24\13\2\u038e\u0393\7`\2\2\u038f\u0393\7\u0088\2\2"+
		"\u0390\u0393\7\u0089\2\2\u0391\u0393\7\u0083\2\2\u0392\u038d\3\2\2\2\u0392"+
		"\u038e\3\2\2\2\u0392\u038f\3\2\2\2\u0392\u0390\3\2\2\2\u0392\u0391\3\2"+
		"\2\2\u0393\u00b5\3\2\2\2\u0394\u0396\7N\2\2\u0395\u0397\5\u00a2R\2\u0396"+
		"\u0395\3\2\2\2\u0396\u0397\3\2\2\2\u0397\u0399\3\2\2\2\u0398\u039a\5\u00b8"+
		"]\2\u0399\u0398\3\2\2\2\u039a\u039b\3\2\2\2\u039b\u0399\3\2\2\2\u039b"+
		"\u039c\3\2\2\2\u039c\u039e\3\2\2\2\u039d\u039f\5\u00ba^\2\u039e\u039d"+
		"\3\2\2\2\u039e\u039f\3\2\2\2\u039f\u00b7\3\2\2\2\u03a0\u03a1\7O\2\2\u03a1"+
		"\u03a2\5\u0094K\2\u03a2\u03a3\7b\2\2\u03a3\u03a4\5\u0094K\2\u03a4\u00b9"+
		"\3\2\2\2\u03a5\u03a6\7a\2\2\u03a6\u03a7\5\u0094K\2\u03a7\u00bb\3\2\2\2"+
		"\u03a8\u03a9\5\u00eav\2\u03a9\u00bd\3\2\2\2\u03aa\u03ac\7r\2\2\u03ab\u03ad"+
		"\7\u029d\2\2\u03ac\u03ab\3\2\2\2\u03ac\u03ad\3\2\2\2\u03ad\u03ae\3\2\2"+
		"\2\u03ae\u03af\7t\2\2\u03af\u03b4\5\u00c0a\2\u03b0\u03b1\7%\2\2\u03b1"+
		"\u03b3\5\u00c0a\2\u03b2\u03b0\3\2\2\2\u03b3\u03b6\3\2\2\2\u03b4\u03b2"+
		"\3\2\2\2\u03b4\u03b5\3\2\2\2\u03b5\u00bf\3\2\2\2\u03b6\u03b4\3\2\2\2\u03b7"+
		"\u03bb\5 \21\2\u03b8\u03bb\5\b\5\2\u03b9\u03bb\5\u0094K\2\u03ba\u03b7"+
		"\3\2\2\2\u03ba\u03b8\3\2\2\2\u03ba\u03b9\3\2\2\2\u03bb\u03bd\3\2\2\2\u03bc"+
		"\u03be\t\17\2\2\u03bd\u03bc\3\2\2\2\u03bd\u03be\3\2\2\2\u03be\u03c3\3"+
		"\2\2\2\u03bf\u03c0\7\u029e\2\2\u03c0\u03c4\7\u015d\2\2\u03c1\u03c2\7\u029e"+
		"\2\2\u03c2\u03c4\7\u029f\2\2\u03c3\u03bf\3\2\2\2\u03c3\u03c1\3\2\2\2\u03c3"+
		"\u03c4\3\2\2\2\u03c4\u00c1\3\2\2\2\u03c5\u03c6\5\u0084C\2\u03c6\u00c3"+
		"\3\2\2\2\u03c7\u03cc\5\u00a2R\2\u03c8\u03c9\7%\2\2\u03c9\u03cb\5\u00a2"+
		"R\2\u03ca\u03c8\3\2\2\2\u03cb\u03ce\3\2\2\2\u03cc\u03ca\3\2\2\2\u03cc"+
		"\u03cd\3\2\2\2\u03cd\u00c5\3\2\2\2\u03ce\u03cc\3\2\2\2\u03cf\u03d2\5\u00c2"+
		"b\2\u03d0\u03d2\5 \21\2\u03d1\u03cf\3\2\2\2\u03d1\u03d0\3\2\2\2\u03d2"+
		"\u00c7\3\2\2\2\u03d3\u03d8\5\u00c6d\2\u03d4\u03d5\7%\2\2\u03d5\u03d7\5"+
		"\u00c6d\2\u03d6\u03d4\3\2\2\2\u03d7\u03da\3\2\2\2\u03d8\u03d6\3\2\2\2"+
		"\u03d8\u03d9\3\2\2\2\u03d9\u00c9\3\2\2\2\u03da\u03d8\3\2\2\2\u03db\u03dc"+
		"\7\37\2\2\u03dc\u03dd\5\u00c8e\2\u03dd\u03de\7 \2\2\u03de\u00cb\3\2\2"+
		"\2\u03df\u03e1\5\u00d0i\2\u03e0\u03e2\5\u008cG\2\u03e1\u03e0\3\2\2\2\u03e1"+
		"\u03e2\3\2\2\2\u03e2\u03eb\3\2\2\2\u03e3\u03eb\5\u00ceh\2\u03e4\u03e6"+
		"\5\u00d0i\2\u03e5\u03e7\5\u008cG\2\u03e6\u03e5\3\2\2\2\u03e6\u03e7\3\2"+
		"\2\2\u03e7\u03e8\3\2\2\2\u03e8\u03e9\5\u00d2j\2\u03e9\u03eb\3\2\2\2\u03ea"+
		"\u03df\3\2\2\2\u03ea\u03e3\3\2\2\2\u03ea\u03e4\3\2\2\2\u03eb\u00cd\3\2"+
		"\2\2\u03ec\u03ed\5\u00d0i\2\u03ed\u03ee\7\37\2\2\u03ee\u03ef\7\u0305\2"+
		"\2\u03ef\u03f0\7\u0080\2\2\u03f0\u03f1\7 \2\2\u03f1\u0404\3\2\2\2\u03f2"+
		"\u03f3\7\u00ff\2\2\u03f3\u03f5\5\u00d0i\2\u03f4\u03f6\7\u011d\2\2\u03f5"+
		"\u03f4\3\2\2\2\u03f5\u03f6\3\2\2\2\u03f6\u03f7\3\2\2\2\u03f7\u03f8\7\37"+
		"\2\2\u03f8\u03f9\7\u0305\2\2\u03f9\u03fa\7 \2\2\u03fa\u0404\3\2\2\2\u03fb"+
		"\u03fd\5\u00d0i\2\u03fc\u03fe\7\37\2\2\u03fd\u03fc\3\2\2\2\u03fd\u03fe"+
		"\3\2\2\2\u03fe\u03ff\3\2\2\2\u03ff\u0401\5 \21\2\u0400\u0402\7 \2\2\u0401"+
		"\u0400\3\2\2\2\u0401\u0402\3\2\2\2\u0402\u0404\3\2\2\2\u0403\u03ec\3\2"+
		"\2\2\u0403\u03f2\3\2\2\2\u0403\u03fb\3\2\2\2\u0404\u00cf\3\2\2\2\u0405"+
		"\u0441\7\u0080\2\2\u0406\u0441\7\u015e\2\2\u0407\u0441\7\u015f\2\2\u0408"+
		"\u0441\7\u0160\2\2\u0409\u0441\7\u0161\2\2\u040a\u0441\7\u0162\2\2\u040b"+
		"\u0441\7\u0163\2\2\u040c\u040d\7\u0163\2\2\u040d\u0441\7\u015f\2\2\u040e"+
		"\u0441\7\u0164\2\2\u040f\u0441\7\u0165\2\2\u0410\u0441\7\u0166\2\2\u0411"+
		"\u0441\7\u0167\2\2\u0412\u0441\7\u0168\2\2\u0413\u0441\7~\2\2\u0414\u0441"+
		"\7\u0169\2\2\u0415\u0441\7\u016a\2\2\u0416\u0441\7\u00ab\2\2\u0417\u0441"+
		"\7\u016b\2\2\u0418\u0441\7T\2\2\u0419\u0441\7\u016c\2\2\u041a\u0441\7"+
		"\u016d\2\2\u041b\u0441\7\u016e\2\2\u041c\u0441\7\u016f\2\2\u041d\u0441"+
		"\7\u0170\2\2\u041e\u0441\7\u0171\2\2\u041f\u0441\7\u0172\2\2\u0420\u0441"+
		"\7\u0173\2\2\u0421\u0441\7\u0084\2\2\u0422\u0441\7\u0087\2\2\u0423\u0424"+
		"\7\u0087\2\2\u0424\u0425\7K\2\2\u0425\u0426\7\u0085\2\2\u0426\u0441\7"+
		"\u011f\2\2\u0427\u0428\7\u0087\2\2\u0428\u0429\7K\2\2\u0429\u042a\7\u00a4"+
		"\2\2\u042a\u042b\7\u0085\2\2\u042b\u0441\7\u011f\2\2\u042c\u042d\7\u0083"+
		"\2\2\u042d\u042e\7\u008e\2\2\u042e\u042f\7d\2\2\u042f\u0441\7\u0091\2"+
		"\2\u0430\u0431\7\u0083\2\2\u0431\u0432\7\u008a\2\2\u0432\u0433\7d\2\2"+
		"\u0433\u0441\7\u008c\2\2\u0434\u0441\7\u0174\2\2\u0435\u0441\7\u00b2\2"+
		"\2\u0436\u0441\7\u00ac\2\2\u0437\u0438\7\177\2\2\u0438\u0441\7D\2\2\u0439"+
		"\u0441\7\u00af\2\2\u043a\u0441\7\u00b0\2\2\u043b\u0441\7\u00ad\2\2\u043c"+
		"\u0441\7\u00b1\2\2\u043d\u0441\7\u0175\2\2\u043e\u0441\7\u0302\2\2\u043f"+
		"\u0441\7\u0207\2\2\u0440\u0405\3\2\2\2\u0440\u0406\3\2\2\2\u0440\u0407"+
		"\3\2\2\2\u0440\u0408\3\2\2\2\u0440\u0409\3\2\2\2\u0440\u040a\3\2\2\2\u0440"+
		"\u040b\3\2\2\2\u0440\u040c\3\2\2\2\u0440\u040e\3\2\2\2\u0440\u040f\3\2"+
		"\2\2\u0440\u0410\3\2\2\2\u0440\u0411\3\2\2\2\u0440\u0412\3\2\2\2\u0440"+
		"\u0413\3\2\2\2\u0440\u0414\3\2\2\2\u0440\u0415\3\2\2\2\u0440\u0416\3\2"+
		"\2\2\u0440\u0417\3\2\2\2\u0440\u0418\3\2\2\2\u0440\u0419\3\2\2\2\u0440"+
		"\u041a\3\2\2\2\u0440\u041b\3\2\2\2\u0440\u041c\3\2\2\2\u0440\u041d\3\2"+
		"\2\2\u0440\u041e\3\2\2\2\u0440\u041f\3\2\2\2\u0440\u0420\3\2\2\2\u0440"+
		"\u0421\3\2\2\2\u0440\u0422\3\2\2\2\u0440\u0423\3\2\2\2\u0440\u0427\3\2"+
		"\2\2\u0440\u042c\3\2\2\2\u0440\u0430\3\2\2\2\u0440\u0434\3\2\2\2\u0440"+
		"\u0435\3\2\2\2\u0440\u0436\3\2\2\2\u0440\u0437\3\2\2\2\u0440\u0439\3\2"+
		"\2\2\u0440\u043a\3\2\2\2\u0440\u043b\3\2\2\2\u0440\u043c\3\2\2\2\u0440"+
		"\u043d\3\2\2\2\u0440\u043e\3\2\2\2\u0440\u043f\3\2\2\2\u0441\u00d1\3\2"+
		"\2\2\u0442\u0444\7K\2\2\u0443\u0445\7\u00a4\2\2\u0444\u0443\3\2\2\2\u0444"+
		"\u0445\3\2\2\2\u0445\u0446\3\2\2\2\u0446\u0447\7\u0085\2\2\u0447\u0449"+
		"\7\u011f\2\2\u0448\u0442\3\2\2\2\u0448\u0449\3\2\2\2\u0449\u0454\3\2\2"+
		"\2\u044a\u044b\7d\2\2\u044b\u0454\7\u008c\2\2\u044c\u044d\7d\2\2\u044d"+
		"\u0451\7\u0091\2\2\u044e\u044f\7\37\2\2\u044f\u0450\7\u0305\2\2\u0450"+
		"\u0452\7 \2\2\u0451\u044e\3\2\2\2\u0451\u0452\3\2\2\2\u0452\u0454\3\2"+
		"\2\2\u0453\u0448\3\2\2\2\u0453\u044a\3\2\2\2\u0453\u044c\3\2\2\2\u0454"+
		"\u00d3\3\2\2\2\u0455\u0456\7\u0117\2\2\u0456\u0457\7\37\2\2\u0457\u0458"+
		"\5\u0094K\2\u0458\u045a\7^\2\2\u0459\u045b\7\u0107\2\2\u045a\u0459\3\2"+
		"\2\2\u045a\u045b\3\2\2\2\u045b\u045c\3\2\2\2\u045c\u045d\5\u00d0i\2\u045d"+
		"\u045e\7 \2\2\u045e\u00d5\3\2\2\2\u045f\u0465\5\u00d4k\2\u0460\u0465\5"+
		"\u00d8m\2\u0461\u0465\5\u00e0q\2\u0462\u0465\5\u00e2r\2\u0463\u0465\5"+
		"\u00e4s\2\u0464\u045f\3\2\2\2\u0464\u0460\3\2\2\2\u0464\u0461\3\2\2\2"+
		"\u0464\u0462\3\2\2\2\u0464\u0463\3\2\2\2\u0465\u00d7\3\2\2\2\u0466\u0469"+
		"\7N\2\2\u0467\u046a\5\u00dan\2\u0468\u046a\5\u00dco\2\u0469\u0467\3\2"+
		"\2\2\u0469\u0468\3\2\2\2\u046a\u046c\3\2\2\2\u046b\u046d\5\u00dep\2\u046c"+
		"\u046b\3\2\2\2\u046c\u046d\3\2\2\2\u046d\u046e\3\2\2\2\u046e\u046f\7\u00ea"+
		"\2\2\u046f\u00d9\3\2\2\2\u0470\u0472\5\u0094K\2\u0471\u0473\5\u00dco\2"+
		"\u0472\u0471\3\2\2\2\u0473\u0474\3\2\2\2\u0474\u0472\3\2\2\2\u0474\u0475"+
		"\3\2\2\2\u0475\u00db\3\2\2\2\u0476\u0477\7O\2\2\u0477\u0478\5\u0094K\2"+
		"\u0478\u0479\7b\2\2\u0479\u047a\5\u00a2R\2\u047a\u00dd\3\2\2\2\u047b\u047c"+
		"\7a\2\2\u047c\u047d\5\u0094K\2\u047d\u00df\3\2\2\2\u047e\u047f\7\37\2"+
		"\2\u047f\u0480\5\u0094K\2\u0480\u0481\7\20\2\2\u0481\u0482\5\u0094K\2"+
		"\u0482\u0498\7 \2\2\u0483\u0487\7\u008e\2\2\u0484\u0485\7\37\2\2\u0485"+
		"\u0486\7\u0305\2\2\u0486\u0488\7 \2\2\u0487\u0484\3\2\2\2\u0487\u0488"+
		"\3\2\2\2\u0488\u0489\3\2\2\2\u0489\u048a\7d\2\2\u048a\u048e\7\u0091\2"+
		"\2\u048b\u048c\7\37\2\2\u048c\u048d\7\u0305\2\2\u048d\u048f\7 \2\2\u048e"+
		"\u048b\3\2\2\2\u048e\u048f\3\2\2\2\u048f\u0499\3\2\2\2\u0490\u0494\7\u008a"+
		"\2\2\u0491\u0492\7\37\2\2\u0492\u0493\7\u0305\2\2\u0493\u0495\7 \2\2\u0494"+
		"\u0491\3\2\2\2\u0494\u0495\3\2\2\2\u0495\u0496\3\2\2\2\u0496\u0497\7d"+
		"\2\2\u0497\u0499\7\u008c\2\2\u0498\u0483\3\2\2\2\u0498\u0490\3\2\2\2\u0499"+
		"\u00e1\3\2\2\2\u049a\u049b\7\37\2\2\u049b\u049c\5\u00a2R\2\u049c\u049d"+
		"\7 \2\2\u049d\u04a0\3\2\2\2\u049e\u04a0\5\u00d4k\2\u049f\u049a\3\2\2\2"+
		"\u049f\u049e\3\2\2\2\u04a0\u04a1\3\2\2\2\u04a1\u04af\7\24\2\2\u04a2\u04a7"+
		"\5\u00c2b\2\u04a3\u04a4\7\24\2\2\u04a4\u04a6\5\u00c2b\2\u04a5\u04a3\3"+
		"\2\2\2\u04a6\u04a9\3\2\2\2\u04a7\u04a5\3\2\2\2\u04a7\u04a8\3\2\2\2\u04a8"+
		"\u04ac\3\2\2\2\u04a9\u04a7\3\2\2\2\u04aa\u04ab\7\24\2\2\u04ab\u04ad\5"+
		"\u00a4S\2\u04ac\u04aa\3\2\2\2\u04ac\u04ad\3\2\2\2\u04ad\u04b0\3\2\2\2"+
		"\u04ae\u04b0\5\u00a4S\2\u04af\u04a2\3\2\2\2\u04af\u04ae\3\2\2\2\u04b0"+
		"\u00e3\3\2\2\2\u04b1\u04b2\7\u0100\2\2\u04b2\u04b3\5\u00d0i\2\u04b3\u04b4"+
		"\5\u0092J\2\u04b4\u00e5\3\2\2\2\u04b5\u04b6\7\u0302\2\2\u04b6\u00e7\3"+
		"\2\2\2\u04b7\u04bc\5\u00e6t\2\u04b8\u04b9\7%\2\2\u04b9\u04bb\5\u00e6t"+
		"\2\u04ba\u04b8\3\2\2\2\u04bb\u04be\3\2\2\2\u04bc\u04ba\3\2\2\2\u04bc\u04bd"+
		"\3\2\2\2\u04bd\u00e9\3\2\2\2\u04be\u04bc\3\2\2\2\u04bf\u04c0\7\3\2\2\u04c0"+
		"\u00eb\3\2\2\2\u04c1\u04c2\7\u016b\2\2\u04c2\u00ed\3\2\2\2\u04c3\u04c4"+
		"\5\24\13\2\u04c4\u00ef\3\2\2\2\u04c5\u04c6\5\24\13\2\u04c6\u00f1\3\2\2"+
		"\2\u04c7\u04c8\7\u0303\2\2\u04c8\u00f3\3\2\2\2\u04c9\u04ca\7\u0303\2\2"+
		"\u04ca\u00f5\3\2\2\2\u04cb\u04cc\7\u0303\2\2\u04cc\u00f7\3\2\2\2\u04cd"+
		"\u04ce\7\u0304\2\2\u04ce\u00f9\3\2\2\2\u04cf\u04d0\7\u0303\2\2\u04d0\u00fb"+
		"\3\2\2\2\u04d1\u04d2\5\24\13\2\u04d2\u00fd\3\2\2\2\u04d3\u04d4\5\24\13"+
		"\2\u04d4\u00ff\3\2\2\2\u04d5\u04d6\5\24\13\2\u04d6\u0101\3\2\2\2\u04d7"+
		"\u04d8\5\24\13\2\u04d8\u0103\3\2\2\2\u04d9\u04da\5\24\13\2\u04da\u0105"+
		"\3\2\2\2\u04db\u04dc\5\24\13\2\u04dc\u0107\3\2\2\2\u04dd\u04de\5\24\13"+
		"\2\u04de\u0109\3\2\2\2\u04df\u04e0\5\24\13\2\u04e0\u010b\3\2\2\2\u04e1"+
		"\u04e2\5\24\13\2\u04e2\u010d\3\2\2\2\u04e3\u04e4\5\24\13\2\u04e4\u010f"+
		"\3\2\2\2\u04e5\u04e6\5\24\13\2\u04e6\u0111\3\2\2\2\u04e7\u04ec\5\n\6\2"+
		"\u04e8\u04ec\5\6\4\2\u04e9\u04ec\5\b\5\2\u04ea\u04ec\5\u0094K\2\u04eb"+
		"\u04e7\3\2\2\2\u04eb\u04e8\3\2\2\2\u04eb\u04e9\3\2\2\2\u04eb\u04ea\3\2"+
		"\2\2\u04ec\u0113\3\2\2\2\u04ed\u04ee\5\b\5\2\u04ee\u0115\3\2\2\2\u04ef"+
		"\u04f0\5\b\5\2\u04f0\u0117\3\2\2\2\u04f1\u04f2\7\u0305\2\2\u04f2\u0119"+
		"\3\2\2\2\u04f3\u04f4\5\24\13\2\u04f4\u011b\3\2\2\2\u04f5\u04f6\5\6\4\2"+
		"\u04f6\u011d\3\2\2\2\u04f7\u04f8\5\6\4\2\u04f8\u011f\3\2\2\2\u04f9\u04fa"+
		"\5\6\4\2\u04fa\u0121\3\2\2\2\u04fb\u04fc\5\24\13\2\u04fc\u0123\3\2\2\2"+
		"\u04fd\u04fe\5\24\13\2\u04fe\u0125\3\2\2\2\u04ff\u0500\5\24\13\2\u0500"+
		"\u0127\3\2\2\2\u0501\u0502\5\24\13\2\u0502\u0129\3\2\2\2\u0503\u0504\5"+
		"\24\13\2\u0504\u012b\3\2\2\2\u0505\u0509\5\b\5\2\u0506\u0509\5\u0094K"+
		"\2\u0507\u0509\5\22\n\2\u0508\u0505\3\2\2\2\u0508\u0506\3\2\2\2\u0508"+
		"\u0507\3\2\2\2\u0509\u012d\3\2\2\2\u050a\u050e\5\b\5\2\u050b\u050e\5\u0094"+
		"K\2\u050c\u050e\5\22\n\2\u050d\u050a\3\2\2\2\u050d\u050b\3\2\2\2\u050d"+
		"\u050c\3\2\2\2\u050e\u012f\3\2\2\2\u050f\u0513\5\b\5\2\u0510\u0513\5\u0094"+
		"K\2\u0511\u0513\5\22\n\2\u0512\u050f\3\2\2\2\u0512\u0510\3\2\2\2\u0512"+
		"\u0511\3\2\2\2\u0513\u0131\3\2\2\2\u0514\u0515\5\24\13\2\u0515\u0133\3"+
		"\2\2\2\u0516\u0517\58\35\2\u0517\u0518\7\24\2\2\u0518\u051a\3\2\2\2\u0519"+
		"\u0516\3\2\2\2\u0519\u051a\3\2\2\2\u051a\u051b\3\2\2\2\u051b\u051c\5:"+
		"\36\2\u051c\u0135\3\2\2\2\u051d\u051e\7\u0303\2\2\u051e\u0137\3\2\2\2"+
		"\u051f\u0520\7\u0303\2\2\u0520\u0139\3\2\2\2\u0521\u0522\5 \21\2\u0522"+
		"\u013b\3\2\2\2\u0523\u0524\58\35\2\u0524\u0525\7\24\2\2\u0525\u0527\3"+
		"\2\2\2\u0526\u0523\3\2\2\2\u0526\u0527\3\2\2\2\u0527\u0528\3\2\2\2\u0528"+
		"\u0529\5:\36\2\u0529\u013d\3\2\2\2\u052a\u052b\58\35\2\u052b\u052c\7\24"+
		"\2\2\u052c\u052e\3\2\2\2\u052d\u052a\3\2\2\2\u052d\u052e\3\2\2\2\u052e"+
		"\u052f\3\2\2\2\u052f\u0530\5:\36\2\u0530\u013f\3\2\2\2\u0531\u0532\5\24"+
		"\13\2\u0532\u0141\3\2\2\2\u0533\u0534\5\24\13\2\u0534\u0143\3\2\2\2\u0535"+
		"\u0538\5\u0094K\2\u0536\u0538\5\b\5\2\u0537\u0535\3\2\2\2\u0537\u0536"+
		"\3\2\2\2\u0538\u0145\3\2\2\2\u0539\u053a\5\24\13\2\u053a\u0147\3\2\2\2"+
		"\u053b\u053c\5\24\13\2\u053c\u0149\3\2\2\2\u053d\u053e\58\35\2\u053e\u053f"+
		"\7\24\2\2\u053f\u0541\3\2\2\2\u0540\u053d\3\2\2\2\u0540\u0541\3\2\2\2"+
		"\u0541\u0542\3\2\2\2\u0542\u0543\5:\36\2\u0543\u014b\3\2\2\2\u0544\u0545"+
		"\5\24\13\2\u0545\u014d\3\2\2\2\u0546\u0547\7\u0304\2\2\u0547\u014f\3\2"+
		"\2\2\u0548\u0549\7\u0304\2\2\u0549\u0151\3\2\2\2\u054a\u054b\7\u0304\2"+
		"\2\u054b\u0153\3\2\2\2\u054c\u054d\7\u0304\2\2\u054d\u0155\3\2\2\2\u054e"+
		"\u054f\5\u0158\u00ad\2\u054f\u0157\3\2\2\2\u0550\u0553\5\24\13\2\u0551"+
		"\u0553\5\6\4\2\u0552\u0550\3\2\2\2\u0552\u0551\3\2\2\2\u0553\u0159\3\2"+
		"\2\2\u0554\u0555\5 \21\2\u0555\u015b\3\2\2\2\u0556\u0557\5\24\13\2\u0557"+
		"\u015d\3\2\2\2\u0558\u0559\58\35\2\u0559\u055a\7\24\2\2\u055a\u055c\3"+
		"\2\2\2\u055b\u0558\3\2\2\2\u055b\u055c\3\2\2\2\u055c\u055d\3\2\2\2\u055d"+
		"\u055e\5:\36\2\u055e\u015f\3\2\2\2\u055f\u0560\58\35\2\u0560\u0561\7\24"+
		"\2\2\u0561\u0563\3\2\2\2\u0562\u055f\3\2\2\2\u0562\u0563\3\2\2\2\u0563"+
		"\u0564\3\2\2\2\u0564\u0565\5:\36\2\u0565\u0161\3\2\2\2\u0566\u0567\5\b"+
		"\5\2\u0567\u0163\3\2\2\2\u0568\u0569\5\b\5\2\u0569\u0165\3\2\2\2\u056a"+
		"\u056b\5\24\13\2\u056b\u0167\3\2\2\2r\u0171\u0176\u0181\u018d\u0196\u019d"+
		"\u01a4\u01ab\u01b2\u01b9\u01c0\u01c7\u01ce\u01d5\u01dc\u01e3\u0201\u0229"+
		"\u022d\u023c\u0243\u0247\u024a\u0251\u0255\u025c\u0260\u0268\u026e\u0270"+
		"\u0275\u027e\u028e\u0296\u02a3\u02b2\u02b4\u02bb\u02c2\u02cb\u02d2\u02db"+
		"\u02e4\u02ed\u02f3\u02f6\u0319\u031b\u0326\u032e\u0334\u033e\u0345\u034b"+
		"\u0350\u0357\u035b\u0365\u0375\u037a\u0385\u0389\u0392\u0396\u039b\u039e"+
		"\u03ac\u03b4\u03ba\u03bd\u03c3\u03cc\u03d1\u03d8\u03e1\u03e6\u03ea\u03f5"+
		"\u03fd\u0401\u0403\u0440\u0444\u0448\u0451\u0453\u045a\u0464\u0469\u046c"+
		"\u0474\u0487\u048e\u0494\u0498\u049f\u04a7\u04ac\u04af\u04bc\u04eb\u0508"+
		"\u050d\u0512\u0519\u0526\u052d\u0537\u0540\u0552\u055b\u0562";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}