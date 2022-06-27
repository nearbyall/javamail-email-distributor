package by.epamtc.melnikov.onlineshop.util.email;

/**
 * The class needed to store email types.
 * Includes one private constructor.
 * 
 * @author nearbyall
 *
 */
public class EmailMessageType {
	
	private EmailMessageType() {}
	
	public static final String TITLE_FORGET_PASSWORD = "title.user.login.byToken";
	public static final String MESSAGE_FORGET_PASSWORD = "message.user.login.byToken";

	public static final String TITLE_USER_BAN_STATUS_UPDATED = "title.user.status.updated";
	public static final String MESSAGE_USER_BAN_STATUS_UPDATED = "message.user.status.updated";
	public static final String MESSAGE_USER_BAN_STATUS_BANNED = "message.user.status.banned";
	public static final String MESSAGE_USER_BAN_STATUS_UNBANNED = "message.user.status.unbanned";

	public static final String TITLE_ORDER_STATUS_UPDATED = "title.order.status.updated";
	public static final String MESSAGE_ORDER_STATUS_UPDATED = "message.order.status.updated";

}
