package com.example.duoduopin.tool;

public class Constants {
    public static final String API_KEY = "18ad3729e308bc702fd5d630df7bddd7";
    public static final String brief_order_content_load_signal = "com.example.duoduopin.home.loaded";
    public static final String group_quit_signal = "com.example.duoduopin.group.quit";
    public static final String group_new_msg_signal = "com.example.duoduopin.group.msg.new";
    public static final String group_id_loaded_signal = "com.example.duoduopin.group.id.loaded";

    private static final String baseUrl = "http://123.57.12.189:8080/";
    private static final String wsUrl = "ws://123.57.12.189:8080/";
    public static final String imageUploadUrl = "https://sm.ms/api/v2/upload";
    public static final String registerUrl = baseUrl + "User/register/";
    public static final String loginUrl = baseUrl + "User/login/";
    public static final String logoutUrl = baseUrl + "User/logout/";
    public static final String changePasswdUrl = baseUrl + "User/update/";

    public static final String queryUrl = baseUrl + "ShareBill/";
    public static final String queryByInfoUrl = queryUrl + "info/";
    public static final String createOrderUrl = queryUrl + "add/";
    public static final String delOrderUrl = queryUrl + "del/";
    public static final String applyUrl = queryUrl + "apply/";
    public static final String joinUrl = queryUrl + "join/";
    public static final String quitUrl = queryUrl + "quit/";
    public static final String queryMemberUrl = queryUrl + "team/";

    public static final String queryUserUrl = baseUrl + "User/";

    public static final String chatUrl = wsUrl + "ws/chat/";
    public static final String queryChatMsgUrl = baseUrl + "chat/";

    public static final String sysMessageUrl = wsUrl + "ws/system/";
    public static final String checkSysMsgUrl = baseUrl + "system/check/";
    public static final String broadMessageUrl = baseUrl + "system/broad/";

    public static final String creditUrl = baseUrl + "Credit/";

    public static String getQueryUserUrl(String userId) {
        return queryUserUrl + userId;
    }

    public static String getQueryUrlByOrderId(String orderId) {
        return queryUrl + orderId;
    }

    public static String getQueryUrlByUserId(String userId) {
        return queryUrl + "user/" + userId;
    }

    public static String getDelOrderUrl(String orderId) {
        return delOrderUrl + orderId;
    }

    public static String getJoinUrl(String orderId) {
        return joinUrl + orderId;
    }

    public static String getAllowUrl(String orderId) {
        return applyUrl + orderId + "/allow/";
    }

    public static String getRejectUrl(String orderId) {
        return applyUrl + orderId + "/reject/";
    }

    public static String getQuitUrl(String orderId, String userId) {
        return quitUrl + orderId + "/" + userId;
    }

    public static String getQueryMemberUrl(String orderId) {
        return queryMemberUrl + orderId;
    }

    public static String getChatUrl(String orderId) {
        return chatUrl + orderId;
    }

    public static String getQueryChatMessageUrl(String orderId) {
        return queryChatMsgUrl + orderId;
    }

    public static String getQueryUserMessageUrl(String orderId, String userId) {
        return queryChatMsgUrl + orderId + "/" + userId;
    }

    public static String getOfflineMessageUrl(String orderId) {
        return queryChatMsgUrl + orderId + "/unchecked";
    }

    public static String getSysMsgUrl(String userId) {
        return sysMessageUrl + userId;
    }
}
