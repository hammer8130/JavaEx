package com.javaex.objectclass.ex4;

import java.util.Arrays;

import com.javaex.basic.reftype.ArrayCopyEx;

//clone 메서드 이용을 위해 Cloneable 인터페이스를 구현
//깊은 복제:
//- 참조 필드의 경우, 새 객체로 만들어서 참조 필드의 값을 변경
public class Scoreboard implements Cloneable {
	private int scores[];

	public Scoreboard(int scores[]) {
		super();
		this.scores = scores;
	}

	public int[] getScores() {
		return scores;
	}

	public void setScores(int[] scores) {
		this.scores = scores;
	}

	@Override
	public String toString() {
		return "Scoreboard [scores=" + Arrays.toString(scores) + "]";
	}

	// 복제본 생성 메서드
	public Scoreboard getClone() {
		// 새로운 인스턴스를 저장할 변수 선언
		Scoreboard clone = null;
		try {
			clone = (Scoreboard) clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;

	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// 깊은 복제를 위해서 내부 참조 데이터를 복제
		
		// 먼저 얕은 복제 시도
		Scoreboard clone = (Scoreboard)super.clone();
		// 내부 참조 객체를 복제 시도 ( 깊은 복제 )
		clone.scores = Arrays.copyOf(scores, scores.length);
		
		return clone; // 만들어진 복제본 반환
	}
}
