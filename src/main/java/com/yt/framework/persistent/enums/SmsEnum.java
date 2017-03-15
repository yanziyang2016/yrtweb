package com.yt.framework.persistent.enums;
/**
 *手机短信枚举类
 *@autor bo.xie
 *@date2015-7-24下午1:45:50
 */
public class SmsEnum {
	
	
	/**
	 * 手机模板类型
	 */
	public enum SMSTEMP {
		/**
		 * 模板ID：JSM40588-0002<br>
		 * 模板内容：尊敬的会员，您本次验证码为：@1@，请勿泄露。
		 */
		JSM405880002("JSM41593-0028"),
		/**
		 * 模板ID：JSM40588-0020<br>
		 * 模板内容：尊敬的用户，@1@请前往宇任拓网站确认11Unplay.com
		 */
		JSM405880020("JSM41593-0016"),
		/**
		 * 模板ID：JSM40588-0021<br>
		 * 模板内容：尊敬的用户，您已与@1@达成比赛共识，比赛日期为@2@，地点为：@3@
		 */
		JSM405880021("JSM41593-0026"),
		/**
		 * 模板ID：JSM40588-0022<br>
		 * 模板内容：尊敬的用户，@1@已上传了一场与您对战的比分，请尽快确认。
		 */
		JSM405880022("JSM41593-0019"),
		/**
		 * 模板ID：JSM40588-0023<br>
		 * 模板内容：尊敬的用户，您与@1@的比赛已结束，请及时上传比赛比分。
		 */
		JSM405880023("JSM41593-0021"),
		/**
		 * 模板ID：JSM40588-0024<br>
		 * 模板内容：尊敬的用户，@1@已确认了您上传的比分，比分已生效。
		 */
		JSM405880024("JSM41593-0022"),
		/**
		 * 模板ID：JSM40588-0025<br>
		 * 模板内容：尊敬的用户，您有比赛结果未上传，@1@后比赛会判定作废。
		 */
		JSM405880025("JSM41593-0023"),
		/**
		 * 模板ID：JSM40588-0026<br>
		 * 模板内容：尊敬的用户，您与@1@比赛已判定作废，如作废比赛超过3场俱乐部将被冻结。
		 */
		JSM405880026("JSM41593-0020"),
		/**
		 * 模板ID：JSM40588-0027<br>
		 * 模板内容：尊敬的用户，@1@邀请你于@2@在@3@进行试训，请准时参加。
		 */
		JSM405880027("JSM41593-0020"),
		/**
		 * 模板ID：JSM40588-0028<br>
		 * 欢迎注册11Uniplay.com，你已注册成功，用户名为注册手机号，登录密码为@1@。
		 */
		JSM405880028("JSM41593-0015"),
		/**
		 * 模板ID：JSM40588-0029<br>
		 * 支付成功，请尽快前往宇任拓官方网站，选择“联赛”并点击“报名”，完善报名资料，如2015-12-12前未完成将视为弃权，不退报名费。
		 */
		JSM405880029("JSM41593-0017"),
		
		/**
		 * 模板ID：JSM40588-0030<br>
		 * 对不起，您的报名资料审核未通过，可前往官网重新报名。
		 */
		JSM405880030("JSM41593-0024"),
		
		/**
		 * 模板ID：JSM40588-0031<br>
		 * 您的报名资料已审核通过，请尽快前往官网完成后续操作。
		 */
		JSM405880031("JSM41593-0025"),
		/**
		 * 模板ID：JSM40588-0032<br>
		 * 您已报名宇任拓超级联赛，完成报名需进入11Unplay.com，点击“联赛”选择“完善资料”进行后续操作。请尽快完成操作，否则视为弃权，报名无效。
		 */
		JSM405880032("JSM41593-0004"),
		/**
		 * 模板ID：JSM40588-0033<br>
		 * 尊敬的@1@主 席：球员@2@已成功被招至麾下听候差遣。@3@赛战火已点燃，祝您带领球队踢出精彩。球员电话：@4@。
		 */
		JSM405880033("JSM41593-0009"),
		/**
		 * 模板ID：JSM40588-0034<br>
		 * 尊敬的@1@：您已正式加入@2@新贵@3@。祝您在@4@开启您的球星之路。球队主 席电话：@5@
		 */
		JSM405880034("JSM41593-0008"),
		
		/**
		 * 模板ID：JSM40588-0035<br>
		 * 主 席大人，你对@1@的出价被@2@超过了，快去看看吧
		 */
		JSM405880035("JSM41593-0027"),
		/**
		 * 模板ID：JSM40588-0036<br>
		 * 尊敬的@1@球员: 你知道吗？@2@各路豪门为了你的加入已争得头破血流。到目前为止，(@3@)已为你出价(@4@)。你准备好了吗？
		 */
		JSM405880036("JSM41593-0010"),
		/**
		 * 模板ID：JSM40588-0037<br>
		 * （@1@）邀请你上传你的精彩瞬间，去完善它吧，说不一定有意外的惊喜哦。
		 */
		JSM405880037("JSM41593-0014"),
		/**
		 * 模板ID：JSM40588-0037<br>
		 * （@1@）邀请你录入你的足球生涯，去完善它吧，说不一定有意外的惊喜哦。
		 */
		JSM405880038("JSM41593-0013"),
		/**
		 * 模板ID：JSM40588-0037<br>
		 * 亲爱的@1@球员，@2@俱乐部已将你挂牌重新放入转会市场待各路诸雄哄抢，赶快来看看你的最新身价吧！！！。
		 */
		JSM405880039("JSM41593-0012"),
		/**
		 * 模板ID：JSM40588-0040<br>
		 * 尊敬的主 席，[@1@][@2@]的球员工资清单已生成，请尽快登录官网确认。 
		 * eg:尊敬的主席，[联赛名称][轮次]的球员工资清单已生成，请尽快登录官网确认。
		 */
		JSM405880040("JSM41593-0011"),
		
		/**
		 * 模板ID：JSM40588-0041<br>
		 * 您已同意@1@购买@2@的交易请求，俱乐部账户余额增加@3@宇币。 
		 */
		
		JSM405880041("JSM41593-0005"),
		
		/**
		 * 模板ID：JSM40588-0042<br>
		 * 未与@1@关于@2@的转会事宜达成一致，本次交易失败。
		 */
		JSM405880042("JSM41593-0006"),
		
		/**
		 * 模板ID：JSM40588-0043<br>
		 * @1@同意了关于@2@的转会事宜，@3@已加入至俱乐部中。
		 */
		JSM405880043("JSM41593-0007"),
		
		/**
		 * 模板ID：JSM40588-0044<br>
		 * 谢谢您完成@1@报名，若有需要我们将电话联系您，请关注宇任拓微信公众号（Uniplay11)获取详情。
		 */
		JSM405880044("JSM41593-0003"),
		
		/**
		 * 模板ID：JSM40588-0045<br>
		 * 尊敬的用户，恭喜您获得@1@期宇币夺宝奖品。请登陆宇任拓官网确认收货信息。如有疑问详询微信Uniplay11。
		 */
		JSM405880045("JSM41593-0002");
		
		private String key = "";

		private SMSTEMP(String key) {
			this.key = key;
		}

		@Override
		public String toString() {
			return this.key;
		}
	}
	
}