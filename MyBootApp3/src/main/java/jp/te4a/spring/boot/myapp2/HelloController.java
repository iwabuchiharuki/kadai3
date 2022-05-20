package jp.te4a.spring.boot.myapp2;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Hello world!
 *
 */
@RestController
public class HelloController 
{
	@RequestMapping("/taro")//URLパス
	public String taro() { //URLパスと同じ名前
		return "Taro desu!"; //戻り値を表示
	}
}
