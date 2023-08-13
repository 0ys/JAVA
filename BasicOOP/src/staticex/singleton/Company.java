package staticex.singleton;
// 싱글톤 패턴이란, 인스턴스를 단 하나만 생성하는 디자인 패턴임. static을 응용하여 구현함
// 예를 들어 어떤 회사의 직원들을 구현한다고 가정했을 때, 직원은 여러 명이지만 회사는 하나임. 이런 경우 회사 객체는 하나만 생성해야 함
/*
issue1: 자바는 글로벌 변수가 없으므로 -> static 변수를 사용
issue2: 생성자가 없으면 public default 생성자가 생성되므로 -> 생성자를 private으로 만듦
issue3: 외부에서 static으로 생성된 객체를 사용할 수 있어야 하므로 -> public으로 선언된 static 메서드 제공
 */

public class Company {
    private static Company instance = new Company(); // 클래스 내부에 유일한 인스턴스를 생성
    private Company() {} // private 생성자

    public static Company getInstance() {
        if (instance == null) {
            instance = new Company();
        }
        return instance;
    }
}
