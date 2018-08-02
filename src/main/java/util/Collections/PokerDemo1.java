package util.Collections;

import java.util.ArrayList;
import java.util.Collections;

/*
 * 模拟斗地主洗牌和发牌
 * 
 * 分析：
 * 		A:创建一个牌盒
 * 		B:装牌
 * 		C:洗牌
 * 		D:发牌
 * 		E:看牌
 */
public class PokerDemo1 {
	public static void main(String[] args) {
		// 创建一个牌盒
		ArrayList<String> array = new ArrayList<String>();
		// 装牌
		// 黑桃A,黑桃2,黑桃3,...黑桃K
		// 红桃A,...
		// 梅花A,...
		// 方块A,...
		// 定义一个花色数组
		String[] colors = { "♥", "♠", "♣", "♦" };
		// 定义一个点数数组
		String[] numbers = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		// 装牌
		for (String color : colors) {
			for (String number : numbers) {
				array.add(color.concat(number));
			}
		}
		array.add("Joker");
		array.add("joker");
		// 洗牌
		Collections.shuffle(array);
		// 发牌
		ArrayList<String> p1 = new ArrayList<String>();
		ArrayList<String> p2 = new ArrayList<String>();
		ArrayList<String> p3 = new ArrayList<String>();
		ArrayList<String> dipai = new ArrayList<String>();
		for (int i = 0; i < array.size(); i++) {
			if (i >= array.size() - 3) {
				dipai.add(array.get(i));
			} else if (i % 3 == 0) {
				p1.add(array.get(i));
			} else if (i % 3 == 1) {
				p2.add(array.get(i));
			} else if (i % 3 == 2) {
				p3.add(array.get(i));
			}
		}
		// 看牌
		System.out.println("-----斗地主发牌模拟器-----");
		lookPoker("玩家一", p1);
		lookPoker("玩家二", p2);
		lookPoker("玩家三", p3);
		lookPoker("底牌", dipai);
	}

	public static void lookPoker(String name, ArrayList<String> array) {
		System.out.print(name + "的牌是：");
		for (String s : array) {
			System.out.print(s + " ");
		}
		System.out.println();
	}
}
