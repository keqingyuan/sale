/**
* <p>
* @className:CustomObjectMapper.java
* @classDescription:
* <p>
* @createTime：2016年8月18日
* @author：Qingyuan
*/

package org.qingyuan.sale.core.config;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * <p>
 * 
 * @className:CustomObjectMapper.java
 * @classDescription:
 *                    <p>
 * @createTime:2016年8月18日
 * @author:Qingyuan
 */

public class CustomObjectMapper extends ObjectMapper {
	private static final long serialVersionUID = -3341366863221844412L;

	public static DateFormat mDateFormat = new SimpleDateFormat("yyyy-MM-dd' 'HH:mm:ss", Locale.ENGLISH);

	public CustomObjectMapper() {
		super();
		setDateFormat(mDateFormat);
	}

	/**
	 * 测试函数
	 */
	public static void main(String[] args) throws ParseException {
		System.out.println(mDateFormat.format(new Date()));
	}
	
//	  <!-- 时间转化，数字转化成数字类型 -->
//		<mvc:annotation-driven>
//			<mvc:message-converters>
//				<bean
//					class="org.springframework.http.converter.json.MappingJackson2HttpMessageConverter">
//					<property name="objectMapper">
//						<bean class="com.fasterxml.jackson.databind.ObjectMapper">
//							<property name="dateFormat">
//								<bean class="java.text.SimpleDateFormat">
//									<constructor-arg type="java.lang.String" value="yyyy-MM-dd HH:mm:ss" />
//								</bean>
//							</property>
//						</bean>
//					</property>
//				</bean>
//			</mvc:message-converters>
//		</mvc:annotation-driven>
}
