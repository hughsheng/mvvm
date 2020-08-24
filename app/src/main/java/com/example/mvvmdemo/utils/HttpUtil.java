package com.example.mvvmdemo.utils;

/**
 * 保存接口地址
 */
public class HttpUtil {

    private static final boolean isUseLocalHost = false;
    private static final String BASE = "base/";

    private static final String MESSAGE = "message/";

    private static final String FILE = "file/";

    private static final String ANALYSIS = "analysis/";

    //登录
    public static final String LOGIN = BASE + "login";
    //查询所有设备信息
    public static final String DEVICE_INFO = BASE + "tEquipment/findPage";
    //设备详情
    public static final String DEVICE_DETAIL = BASE + "tEquipment/findById";

    //设备保养/维修信息
    public static final String SCANEQUIPMENTINFO = BASE + "tEquipmentMaintenance/scanEquipmentInfo";
    //提交设备保养信息
    public static final String COMMITMAINTENANCE = BASE + "tEquipmentMaintenance/save";
    //提交设备维修信息
    public static final String COMMITREPAIR = BASE + "tEquipmentRepair/save";

    //设备二维码查询
    public static final String QRCODEINFO = BASE + "qrcode/getCodeInfo";
    //文件上传
    public static final String UPLOAD = FILE + "file/uploadApp";

    //维修列表
    public static final String FINDREPAIRLIST = BASE + "tEquipmentRepair/findRepairList";

    //具体设备维修信息
    public static final String FINDREPAIR = BASE + "tEquipmentRepair/findRepair";

    //开始维修
    public static final String STARTREPAIR = BASE + "tEquipmentRepair/startRepair";

    //完成维修
    public static final String FINISHREPAIR = BASE + "tEquipmentRepair/finishRepair";

    //设备报修
    public static final String REPORTREPAIR = BASE + "tEquipmentRepair/reportRepair";

    //设备总数
    public static final String EQUIPMENTSUM = BASE + "tEquipment/equipmentSum";

    //查询车间
    public static final String TWORKSHOP = BASE + "tWorkshop/findPage";

    //查询厂房列表
    public static final String TFACTORY = BASE + "tFactory/findPage";

    //查询厂房车间设备实时信息
    public static final String GETCURRENTEQUIPMENTS = BASE + "tFactory/getCurrentEquipments";

    //设备异常列表
    public static final String TEQUIPMENTEXCEPTION = BASE + "tEquipmentException/findPage";

    //危险点信息总览
    public static final String DANGERNUMBER = BASE + "tSecurityBase/findByType";

    //危险点位置分布
    public static final String DANGERPROFILE = BASE + "tSecurityBase/findByFactory";

    //安全点巡查上报
    public static final String DANGERSEARCHCOMMIT = BASE + "tSecurityPatrol/save";

    //安全点巡查记录
    public static final String DANGERSEARCHLIST = BASE + "tSecurityPatrol/findPage";

    //安全类型列表
    public static final String DANGERTYPELIST = BASE + "tSecurityBase/findPage";

    //巡查记录时间
    public static final String DANGERSEARCHDETAIL = BASE + "tSecurityReport/findReportBySecurity";

    //危险汇报
    public static final String DANGERREPORT = BASE + "tSecurityReport/save";

    //危险汇报列表
    public static final String DANGERREPORTLIST = BASE + "tSecurityReport/findPage";

    //查询所有生产计划
    public static final String PRODUCEPROJECT = BASE + "tProducePlan/findPage";

    //提交生产报告
    public static final String COMMITPROJECT = BASE + "tProduceReport/save";

    //我的报告列表
    public static final String MYREPORT = BASE + "tProduceReport/findByUser";

    //提交异常报告
    public static final String EXCEPTIONREPORT = BASE + "tProduceError/save";

    //异常报告列表
    public static final String EXCEPTIONPROJECT = BASE + "tProduceError/findByUser";
    //更新异常状态
    public static final String UPDATE_PRODUCE_REPORT_EXCEPT_STATUS = BASE + "tProduceError/upStatus";

    //生产信息时段概览
    public static final String GETSTATUSBYTIME = BASE + "tProduceReport/getStatusByTime";

    //根据类型查询所有异常报告和对应的生产计划
    public static final String GETALLEXCEPTIONREPORTBYTYPE = BASE + "tProduceError" +
            "/findReportAndPlan";

    //根据类型查询所有报告以及对应的计划
    public static final String GETALLREPORTBYTYPE = BASE + "tProduceReport/findReportAndPlan";

    //库存异常填报
    public static final String COMMITSTOCKEXCEPTION = BASE + "tRepertoryAbnormal/save";

    //库存异常记录列表
    public static final String GETSTOCKEXCEPTIONLIST = BASE + "tRepertoryAbnormal/findPage";

    //原材料库存填报
    public static final String COMMITSTOCKMATERIAL = BASE + "tRepertoryMaterial/save";

    //根据类型获取库存列表
    public static final String GETSTOCKTYPELIST = BASE + "tRepertoryOperation/findPageById";

    //部件库存填报
    public static final String COMMITSTOCKPART = BASE + "tRepertoryParts/save";

    //成品库存填报
    public static final String COMMITSTOCKPRODUCT = BASE + "tRepertoryProduct/save";

    //零件库存填报
    public static final String COMMITSTOCKSPARE = BASE + "tRepertorySpare/save";

    //库存总览
    public static final String GETTOTALSTOCKINFO = BASE + "tNewRepertoryFocus/productStatistics";

    //获取库存(呆滞,超期)列表
    public static final String GET_FOCUS_DULL_AND_OVERTIME_LIST = BASE + "tNewRepertoryProduct/findPage";

    //获取库存列表
    public static final String GET_FOCUS_STOCK_LIST = BASE + "tNewRepertoryFocus/findFocusRepertoryPage";

    //获取库存详情
    public static final String GET_FOCUS_STOCK_DETAIL = BASE + "tNewRepertoryFocus/findFocusRepertoryById";

    //获取库存异常列表
    public static final String GET_FOCUS_STOCK_EXCEPTION_LIST = BASE + "tNewRepertoryFocus" +
            "/findFocusRepertoryAbnormalPage";

    //获取库存异常列表详情
    public static final String GET_FOCUS_STOCK_EXCEPTION_DETAIL = BASE + "tNewRepertoryAbnormal" +
            "/findDetailsById";


    //查询生产计划中的产品
    public static final String GETPRODUCTINFO = BASE + "tProducePlan/findProducing";

    //查询生产计划中的产品批号
    public static final String GETPRODUCTBATCH = BASE + "tProducePlan/findBatch";

    //查询原材料列表
    public static final String GETMATERAILINFO = BASE + "tMaterials/findPage";

    //查询库存异常原因
    public static final String GETEXCEPTIONREASON = BASE + "tRepertoryAbnormal/findAboType";

    //查询所有合同信息列表
    public static final String GETCONTRACTINFOLIST = BASE + "tContractBase/findPage";

    //获取合同概览信息
    public static final String GETCONTRACTOVERVIEW = BASE + "contractBase/getAllContractStatus";

    //查询所有合同执行列表
    public static final String GETCNTRACTEXECUTELIST = BASE + "tContractBaseNew/findListPage";

    //查询异常合同列表
    public static final String GETEXCEPTIONCONTRACTLIST = BASE + "tContractException/findPage";

    //处理异常合同
    public static final String HANDLEEXCEPTIONCONTRACT = BASE + "tContractException/handleException";


    //获取设备保养列表
    public static final String GETDEVICEMAINTAINLIST = BASE + "tEquipmentMaintenance" +
            "/getEquipmentMaintenanceList";

    //设备详情
    public static final String GET_WORK_DEVICE_DETAIL = BASE + "tEquipmentRepair/findRepair";

    //撤销合同执行步骤
    public static final String CANCELCONTRACT = BASE + "tContractExecuteActual/cancelTask";

    //获取具体合同执行流程列表
    public static final String GETCONTRACTACTIONLIST = BASE + "tContractExecute/findByContractId";

    //完成合同执行步骤
    public static final String FINISHCONTRACTACTION = BASE + "tContractExecute/executeByExecuteId";

    //开始执行合同
    public static final String STARTCONTRACT = BASE + "tContractExecute/startByContractId";

    //重新执行合同
    public static final String RESTART_ORDER = BASE + "tContractExecute/resetByContractId";

    //获取我填写的工作报告列表
    public static final String GETMYWORKREPORTLIST = BASE + "tWork/findPageCr";

    //获取我收到的工作报告列表
    public static final String GETRECEIVEDWORKREPORTLIST = BASE + "tWorkFlow/findSend";

    /**
     * 我的关注-人员概况-获取人员出勤统计
     */
    public static final String GET_HR_ATTENDANCE_SUMMARY = BASE + "staffSummary/todayAttendance";

    /**
     * 我的关注-人员异常-月度异常统计
     */
    public static final String GET_HR_MONTHLY_ABNORMAL_SUMMARY = BASE + "staffSummary/monthAttendance";

    /**
     * 我的关注-人员异常-以月度及异常种类分组的人员列表
     */
    public static final String GET_HR_MONTHLY_ABNORMAL_STAFFS = BASE + "staffSummary/abnormalUser";


    /**
     * 我的关注-人员概况-点击栏目获取按状况分类的人员列表
     */
    public static final String GET_HR_STAFFS_BY_STATUS_TYPE = isUseLocalHost ? "http://172.10.6" +
            ".20:9003/staffSummary/todayAttendanceData" : BASE + "staffSummary/todayAttendanceData";

    /**
     * 我的关注-人员详情-获取公司架构
     */
    public static final String GET_ORGANIZATION_STRUCT = BASE + "staffSummary/companyOrganizationInfo";

    /**
     * 我的关注-人员详情-获取公司某一架构下的人员列表
     */
    public static final String GET_HR_STAFFS_BY_LOCATION = BASE + "staffSummary/userWorkInfo";


    /**
     * 我的关注-人员详情-点击头像获取人员信息
     */
    public static final String GET_STAFF_DETAIL = BASE + "staffSummary/getUserDetail";

    /**
     * 获取所有人员的列表
     */
    public static final String GET_ALL_STAFFS = BASE + "staffSummary/allUserInfo";

    //获取工作报告详情
    public static final String GETWORKREPORTDETAIL = BASE + "tWork/findById";

    //提交工作报告
    public static final String COMMITWORKREPORT = BASE + "tWork/save";

    //提交工作批语
    public static final String COMMITWORKREMARK = BASE + "tWorkFlow/opinion";

    //获取摄像头信息
    public static final String GETCAMERAINFO = BASE + "tCameraBase/findById";


    //修改密码
    public static final String UPDATEPASSWORD = BASE + "user/updatePassword";

    //查询厂房子项(1车间或2流水线)
    public static final String GETFACTORYKIDS = BASE + "tFactory/getKids";

    //获取流水线设备
    public static final String GETEQUIPMENTSFROMLINE = BASE + "tWorkshop/getLineEquipment";

    //获取条码配置表
    public static final String GETQRSTTING = BASE + "tBarcodeRules/findById";

    //保存条码配置
    public static final String SAVE_CODE_SETTING = BASE + "tBarcodeRules/save";

    //查询条码对比结果列表
    public static final String GET_QR_RESULT_LIST = BASE + "tBarcodeInfo/findPage";

    //提交对比结果
    public static final String REPORT_COMPARE_RESULT = BASE + "tBarcodeInfo/save";

    //获取最新一次扫码结果
    public static final String GET_COMPARE_RESULT = BASE + "tBarcodeRules/findRecord";

    //验证qr密码
    public static final String VERIFY_QR_PWD = BASE + "tBarcodeRules/findPassword";
    /**
     * 我的关注-财务-收入-获得月度为单位的财务收入
     */
    public static final String GET_FINANCE_INCOME = BASE + "tFinancialInformation/findFinancialTime";
    /**
     * 我的关注-财务-支出-获得月度为单位的财务成本
     */
    public static final String GET_FINANCE_COST = BASE + "tCostInformation/findCostTime";
    /**
     * 我的关注-财务-现金流-获得月度为单位的现金流量
     */
    public static final String GET_FINANCE_CASH_FLOW = BASE + "tRevenueAndCost/findCashFlow";
    /**
     * 我的关注-财务-利润-获得月度为单位的利润
     */
    public static final String GET_FINANCE_PROFIT = BASE + "tRevenueAndCost/findProfits";
    /**
     * 我的关注-人员-人员状况-个人详情界面-人员绩效部分
     */
    public static final String GET_STAFF_PERFORMANCE_BY_ID = BASE + "tStaff/getStaffAchieveInfo";
    /**
     * 我的关注-人员-人员状况-个人详情界面-人员绩效部分
     */
    public static final String GET_STAFF_PERFORMANCE_BY_TIME_AND_ID =
            BASE + "tStaffAchieveDay/countAchievements";
    /**
     * 我的关注-人员-异常人员清单
     */
    public static final String GET_ABNORMAL_STAFFS = BASE + "tStaff/getStaffAbnormal";


    /**
     * 上传埋点数据
     */
    public static final String POST_BURYING_DATA = BASE + "tDataBurying/saveDataBurying";

    /**
     * 我的关注-财务-财务概况-获取四种类型财务数据
     */
    public static final String GET_FINANCE_OVERVIEW = BASE + "tFinance/financialOverview";
    /**
     * 我的关注-财务-财务预警
     */
    public static final String GET_FINANCE_ALERT = BASE + "tFinance/financialAbnormal";
    /**
     * 我的关注-财务-财务预警-详情
     */
    public static final String GET_FINANCE_ALERT_DETAIL = BASE + "tFinance/financialAbnormalDetails";
    /**
     * 我的关注-财务-财务详情
     */
    public static final String GET_FINANCE_DETAIL = BASE + "tFinance/financialDetailsEstimate";

    /**
     * 视频会议-获取用户的会议列表
     */
    public static final String GET_MEETING_LIST = BASE + "meeting/getAttendMeetingList";
    /**
     * 视频会议-发起即时会议
     */
    public static final String START_INSTANT_MEETING = BASE + "meeting/startMeeting";
    /**
     * 视频会议-结束会议
     */
    public static final String END_MEETING = BASE + "meeting/endMeeting";
    /**
     * 视频会议-根据id检查会议当前状态
     */
    public static final String CHECK_MEETING_STATUS = BASE + "meeting/checkMeetingStatus";
    /**
     * 视频会议-预约会议（到期手动发起）
     */
    public static final String APPOINT_MANUAL_MEETING = BASE + "meeting/appointManualMeeting";
    /**
     * 视频会议-预约会议（到期自动发起）
     */
    public static final String APPOINT_AUTO_MEETING = BASE + "meeting/appointAutoMeeting";
    /**
     * 视频会议-拒绝参加会议
     */
    public static final String REFUSE_JOIN_MEETING = BASE + "meeting/refuseMeeting";
    /**
     * 视频会议-编辑预约会议
     */
    public static final String EDIT_APPOINT_MEETING = BASE + "meeting/editAppointment";
    /**
     * 视频会议-删除会议
     */
    public static final String DELETE_MEETING = BASE + "meeting/deleteMeeting";
    /**
     * 视频会议-预约会议到期后，用户手动启动预约会议
     */
    public static final String BEGIN_APPOINT_MEETING = BASE + "meeting/beginAppointMeeting";

    //处理安全点
    public static final String FINISH_SECURITY_EVENT = BASE + "tSecurityReport/upStatus";

    //处理库存
    public static final String FINISH_STOCK_EVENT = BASE + "tRepertoryAbnormal/upStatus";

    //设备概览获取具体设备
    public static final String GET_ITEM_DEVICE = BASE + "tEquipment/findByEquipmentDetail";


    //智能管控未处理消息
    public static final String GET_SMART_CONTROL_MESSAGE = MESSAGE + "tMessage/appSpecialUnReadMessage";

    //所有消息已读
    public static final String SETMSGALLREAD = MESSAGE + "tMessage/readAll";

    //查询消息列表
    public static final String GETMESSAGELIST = MESSAGE + "tMessage/appFindByMyGetMessage";

    //消息详情
    public static final String GETMESSAGEDETAIL = MESSAGE + "tMessage/findMessageInfo";

    //获取最新一条未读消息和未读消息数量
    public static final String GET_LAST_UNREAD_MESSAGE = MESSAGE + "tMessage/appUnReadCount";

    //智能分析合同流程列表
    public static final String GETANALYSECONTEACTLIST = ANALYSIS + "aiFlow/getAllContractIdAndName";

    //智能分析合同流程进度信息
    public static final String GETANALYSECONTRACTFLOW = ANALYSIS + "aiFlow/findContractFlowByMonthAndID";


    //获取成品库存生产部门
    public static final String GET_PRODUCT_DEPARTMENT = BASE + "staffSummary/getCompanyOrganizationAndDept";

    //获取成品库存主订单信息
    public static final String GET_PRODUCT_MAIN_ORDER = BASE + "tNewProducePlan/findBaseContractByDeptId";

    //获取成品库存子订单信息
    public static final String GET_PRODUCT_CHILD_ORDER = BASE + "tNewProducePlan" +
            "/getAllChildContractIdAndName";

    //获取成品库存生产计划
    public static final String GET_PRODUCT_PLAN = BASE + "tNewProducePlan/fundPlanByDeptAndContractAndStatus";

    //成品库存出入库提交
    public static final String PRODUCT_COMMIT = BASE + "tNewRepertoryProduct/save";

    //获取库存仓库列表
    public static final String GET_PRODUCT_DEPOSITORY_LIST = BASE + "tNewStorageController/findAll";

    //库存报告列表
    public static final String GET_STOCK_LIST = BASE + "tNewRepertoryProduct/findPage";

    //库存详情
    public static final String GET_STOCK_DETAIL = BASE + "tNewRepertoryProduct/findDetailsById";


    //获取原材料库存采购订单列表
    public static final String GET_MATERIAL_BUY_LIST = BASE + "tPurchase/findAll";

    //获取原材料库存采购订单信息
    public static final String GET_MATERIAL_BUY_DETAIL = BASE + "tPurchaseDetails/findAllByPurchaseId";

    //原材料库存提交
    public static final String MATERIAL_COMMIT = BASE + "tNewRepertoryMaterials/save";


    //库存异常提交
    public static final String STOCK_EXCEPTION_COMMIT = BASE + "tNewRepertoryAbnormal/save";

    //库存异常列表
    public static final String GET_STOCK_EXCEPTION_LIST = BASE + "tNewRepertoryAbnormal/findPage";

    //库存异常详情
    public static final String GET_STOCK_EXCEPTION_DETAIL = BASE + "tNewRepertoryAbnormal/findDetailsById";

    //库存异常处理
    public static final String HANDLE_STOCK_EXCEPTION = BASE + "tNewRepertoryAbnormal/dealAbnormal";

    //成品生产计划详情
    public static final String GET_PRODUCT_PLAN_DETAIL = BASE + "tNewProducePlan/findContractProducePlanById";

    //获取原材料列表
    public static final String GET_MATERIAL_LIST = BASE + "tNewRepertoryMaterials/findAllMaterialsInfo";

    //获取库存异常列表
    public static final String GET_STOCK_EXCEPTION_REASON_LIST = BASE + "tNewRepertoryAbnormal/findAbnormalStatusAll";

    //获取库存数量和所在仓库
    public static final String GET_STOCK_NUMBER_AND_DEPOSITORY = BASE + "tNewRepertoryProduct/getInOutStorageInfo";


}
