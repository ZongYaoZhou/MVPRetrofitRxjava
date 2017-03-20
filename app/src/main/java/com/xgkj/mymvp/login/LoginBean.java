package com.xgkj.mymvp.login;

/**
 * Created by zhouzongyao on 2017/3/18.
 */

public class LoginBean {
    /**
     * data : {"user_id":1,"email":"240874144@qq.com","password":"519475228fe35ad067744465c42a19b2","paypwd":null,"sex":1,"birthday":1472486400,"user_money":"19475.41","frozen_money":"0.00","distribut_money":"0.00","pay_points":0,"address_id":1,"reg_time":1245048540,"last_login":1477107222,"last_ip":"0.0.0.0","qq":"511482696","mobile":"13800138006","mobile_validated":1,"oauth":"","openid":null,"unionid":null,"head_pic":"","province":5827,"city":6542,"district":6563,"email_validated":1,"nickname":"tests","level":1,"discount":"1.00","total_amount":"39042.46","is_lock":0,"is_distribut":0,"first_leader":0,"second_leader":0,"third_leader":0,"token":"00a1c0366b96e5c3bfff8bd1d85fa557","type":"1","status":"1","username":null,"coupon_count":9,"follow":1,"waitPay":212,"waitSend":118,"waitReceive":3,"order_count":333,"return_counts":9}
     * state : {"code":200,"msg":"登录成功","debugMsg":"","url":"api/Login/login"}
     */

    private DataBean data;
    private StateBean state;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public StateBean getState() {
        return state;
    }

    public void setState(StateBean state) {
        this.state = state;
    }

    public static class DataBean {
        /**
         * user_id : 1
         * email : 240874144@qq.com
         * password : 519475228fe35ad067744465c42a19b2
         * paypwd : null
         * sex : 1
         * birthday : 1472486400
         * user_money : 19475.41
         * frozen_money : 0.00
         * distribut_money : 0.00
         * pay_points : 0
         * address_id : 1
         * reg_time : 1245048540
         * last_login : 1477107222
         * last_ip : 0.0.0.0
         * qq : 511482696
         * mobile : 13800138006
         * mobile_validated : 1
         * oauth :
         * openid : null
         * unionid : null
         * head_pic :
         * province : 5827
         * city : 6542
         * district : 6563
         * email_validated : 1
         * nickname : tests
         * level : 1
         * discount : 1.00
         * total_amount : 39042.46
         * is_lock : 0
         * is_distribut : 0
         * first_leader : 0
         * second_leader : 0
         * third_leader : 0
         * token : 00a1c0366b96e5c3bfff8bd1d85fa557
         * type : 1
         * status : 1
         * username : null
         * coupon_count : 9
         * follow : 1
         * waitPay : 212
         * waitSend : 118
         * waitReceive : 3
         * order_count : 333
         * return_counts : 9
         */

        private int user_id;
        private String email;
        private String password;
        private Object paypwd;
        private int sex;
        private int birthday;
        private String user_money;
        private String frozen_money;
        private String distribut_money;
        private int pay_points;
        private int address_id;
        private int reg_time;
        private int last_login;
        private String last_ip;
        private String qq;
        private String mobile;
        private int mobile_validated;
        private String oauth;
        private Object openid;
        private Object unionid;
        private String head_pic;
        private int province;
        private int city;
        private int district;
        private int email_validated;
        private String nickname;
        private int level;
        private String discount;
        private String total_amount;
        private int is_lock;
        private int is_distribut;
        private int first_leader;
        private int second_leader;
        private int third_leader;
        private String token;
        private String type;
        private String status;
        private Object username;
        private int coupon_count;
        private int follow;
        private int waitPay;
        private int waitSend;
        private int waitReceive;
        private int order_count;
        private int return_counts;

        public int getUser_id() {
            return user_id;
        }

        public void setUser_id(int user_id) {
            this.user_id = user_id;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public Object getPaypwd() {
            return paypwd;
        }

        public void setPaypwd(Object paypwd) {
            this.paypwd = paypwd;
        }

        public int getSex() {
            return sex;
        }

        public void setSex(int sex) {
            this.sex = sex;
        }

        public int getBirthday() {
            return birthday;
        }

        public void setBirthday(int birthday) {
            this.birthday = birthday;
        }

        public String getUser_money() {
            return user_money;
        }

        public void setUser_money(String user_money) {
            this.user_money = user_money;
        }

        public String getFrozen_money() {
            return frozen_money;
        }

        public void setFrozen_money(String frozen_money) {
            this.frozen_money = frozen_money;
        }

        public String getDistribut_money() {
            return distribut_money;
        }

        public void setDistribut_money(String distribut_money) {
            this.distribut_money = distribut_money;
        }

        public int getPay_points() {
            return pay_points;
        }

        public void setPay_points(int pay_points) {
            this.pay_points = pay_points;
        }

        public int getAddress_id() {
            return address_id;
        }

        public void setAddress_id(int address_id) {
            this.address_id = address_id;
        }

        public int getReg_time() {
            return reg_time;
        }

        public void setReg_time(int reg_time) {
            this.reg_time = reg_time;
        }

        public int getLast_login() {
            return last_login;
        }

        public void setLast_login(int last_login) {
            this.last_login = last_login;
        }

        public String getLast_ip() {
            return last_ip;
        }

        public void setLast_ip(String last_ip) {
            this.last_ip = last_ip;
        }

        public String getQq() {
            return qq;
        }

        public void setQq(String qq) {
            this.qq = qq;
        }

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public int getMobile_validated() {
            return mobile_validated;
        }

        public void setMobile_validated(int mobile_validated) {
            this.mobile_validated = mobile_validated;
        }

        public String getOauth() {
            return oauth;
        }

        public void setOauth(String oauth) {
            this.oauth = oauth;
        }

        public Object getOpenid() {
            return openid;
        }

        public void setOpenid(Object openid) {
            this.openid = openid;
        }

        public Object getUnionid() {
            return unionid;
        }

        public void setUnionid(Object unionid) {
            this.unionid = unionid;
        }

        public String getHead_pic() {
            return head_pic;
        }

        public void setHead_pic(String head_pic) {
            this.head_pic = head_pic;
        }

        public int getProvince() {
            return province;
        }

        public void setProvince(int province) {
            this.province = province;
        }

        public int getCity() {
            return city;
        }

        public void setCity(int city) {
            this.city = city;
        }

        public int getDistrict() {
            return district;
        }

        public void setDistrict(int district) {
            this.district = district;
        }

        public int getEmail_validated() {
            return email_validated;
        }

        public void setEmail_validated(int email_validated) {
            this.email_validated = email_validated;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public int getLevel() {
            return level;
        }

        public void setLevel(int level) {
            this.level = level;
        }

        public String getDiscount() {
            return discount;
        }

        public void setDiscount(String discount) {
            this.discount = discount;
        }

        public String getTotal_amount() {
            return total_amount;
        }

        public void setTotal_amount(String total_amount) {
            this.total_amount = total_amount;
        }

        public int getIs_lock() {
            return is_lock;
        }

        public void setIs_lock(int is_lock) {
            this.is_lock = is_lock;
        }

        public int getIs_distribut() {
            return is_distribut;
        }

        public void setIs_distribut(int is_distribut) {
            this.is_distribut = is_distribut;
        }

        public int getFirst_leader() {
            return first_leader;
        }

        public void setFirst_leader(int first_leader) {
            this.first_leader = first_leader;
        }

        public int getSecond_leader() {
            return second_leader;
        }

        public void setSecond_leader(int second_leader) {
            this.second_leader = second_leader;
        }

        public int getThird_leader() {
            return third_leader;
        }

        public void setThird_leader(int third_leader) {
            this.third_leader = third_leader;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public Object getUsername() {
            return username;
        }

        public void setUsername(Object username) {
            this.username = username;
        }

        public int getCoupon_count() {
            return coupon_count;
        }

        public void setCoupon_count(int coupon_count) {
            this.coupon_count = coupon_count;
        }

        public int getFollow() {
            return follow;
        }

        public void setFollow(int follow) {
            this.follow = follow;
        }

        public int getWaitPay() {
            return waitPay;
        }

        public void setWaitPay(int waitPay) {
            this.waitPay = waitPay;
        }

        public int getWaitSend() {
            return waitSend;
        }

        public void setWaitSend(int waitSend) {
            this.waitSend = waitSend;
        }

        public int getWaitReceive() {
            return waitReceive;
        }

        public void setWaitReceive(int waitReceive) {
            this.waitReceive = waitReceive;
        }

        public int getOrder_count() {
            return order_count;
        }

        public void setOrder_count(int order_count) {
            this.order_count = order_count;
        }

        public int getReturn_counts() {
            return return_counts;
        }

        public void setReturn_counts(int return_counts) {
            this.return_counts = return_counts;
        }
    }

    public static class StateBean {
        /**
         * code : 200
         * msg : 登录成功
         * debugMsg :
         * url : api/Login/login
         */

        private int code;
        private String msg;
        private String debugMsg;
        private String url;

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

        public String getDebugMsg() {
            return debugMsg;
        }

        public void setDebugMsg(String debugMsg) {
            this.debugMsg = debugMsg;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}
