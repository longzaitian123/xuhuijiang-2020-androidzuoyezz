package com.example.zuoye7.bean;

import com.example.zuoye7.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "康夫", "飞利浦", "博朗", "放松一博", "云麦", "小适", "蓓慈", "飞科"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "康夫（CONFU）美发器KF-535A内扣大波浪直卷两用发夹梨花头卷发棒懒人神器女直发夹",
            "飞利浦(Philips)声波震动式电动牙刷HX6730 成人充电式牙刷31000转/分钟 敏感/清洁/亮白 三大模式",
            "博朗（BRAUN）电动剃须刀 3系 301s 进口三刀头 全身水洗 5分钟闪充 充电式 往复式 刮胡刀",
            "放松一博 SKG4098全新升级蓝牙款颈椎按摩器颈部按摩仪多功能脖子振动家用智能护颈仪",
            "云麦（YUNMAI）筋膜枪按摩抢小米有品同款按摩活络筋膜抢筋膜棒肌肉放松器材电动球便携",
            "小适（Showsee）小米有品同款 电动便携式鼻毛修剪器C1-BK 刀头水洗 全方位剃毛 无痛静音",
            "蓓慈（beici）按摩披肩BAP03A升级款 肩部腰部腿部颈部按摩 过热保护 敲击按摩捶打按摩香槟色按摩器",
            "飞科（FIYCO）电吹风FH6232 2000瓦功率快速干发六档调节可折叠家用电吹风"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {56, 359, 269, 499, 1299, 31, 89, 49};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.p1, R.drawable.p2, R.drawable.p3,
            R.drawable.p4, R.drawable.p5, R.drawable.p6, R.drawable.p7, R.drawable.p8
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.p1, R.drawable.p2, R.drawable.p3,
            R.drawable.p4, R.drawable.p5, R.drawable.p6, R.drawable.p7, R.drawable.p8
    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}