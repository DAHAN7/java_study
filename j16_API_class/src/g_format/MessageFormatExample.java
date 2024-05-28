package g_format;

import java.text.MessageFormat;

public class MessageFormatExample {

	public static void main(String[] args) {
		String text = "회원 ID : {0} \n회원이름 : {1} \n전화번호 : {2}";
		String result = MessageFormat.format(text,"id001","최기근","010-9486-7166");
		System.out.println(result);
	}

}