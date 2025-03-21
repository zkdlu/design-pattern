# 생성 패턴
 - 객체 생성에 관련된 패턴
 - 객체의 생성과 조합을 캡슐화 해 특정 객체가 생성되거나 변경되어도 프로그램 구조에 영향을 크게 받지 않도록 유연성을 제공

## 추상 팩토리 (Abstract Factory)
 - 서로 관련이 있는 객체들을 묶어서 팩토리 클래스로 만들고, 팩토리를 조건에 따라 생성하도록 다시 팩토리를 만들어 객체를 생성하는 패턴
## 빌더 (Builder)
- 인스턴스를 생성자를 통해 직접 생성하지 않고, 빌더라는 내부 클래스를 통해 간접적으로 생성하게 하는 패턴
## 팩토리 메서드 (Factory Method)
 - 조건에 따른 객체 생성을 팩토리 클래스로 위임하여, 팩토리 클래스에서 객체를 생성하는 패턴
## 프로토타입 (Prototype)
 - 원본(Prototype)을 만들어 놓고 원본 객체를 복사하여 사용하는 패턴
## 싱글턴 (Singleton)
 - 클래스 내에서 인스턴스가 단 하나뿐임을 보장하는 패턴

# 구조 패턴
 - 클래스나 객체를 조합해 더 큰 구조를 만드는 패턴
 - 예를 들어 서로 다른 인터페이스를 지닌 2개의 객체를 묶어 단일 인터페이스를 제공하거나, 객체들을 서로 묶어 새로운 기능을 제공하는 패턴

## 어댑터 (Adapter)
 - 서로 비슷한 기능인데 사용 방법이 달라 호환성이 없는 클래스를 래핑해 사용자에게 같은 인터페이스를 제공하는 패턴
## 브릿지 (Bridge)
 - 추상적 개념 클래스를 정의하고 이를 통해 구체적 기능을 사용하는 패턴
## 컴퍼지트 (Composite)
 - 단일 객체와 복합 객체를 같은 방법으로 사용할 수 있게 하는 패턴
## 데코레이터 (Decorator)
 - 단위 기능을 하는 클래스를 혼합하여 여러 기능을 사용할 수 있게 하는 패턴
## 퍼샤드 (Facade)
 - 복잡한 호출과정을 대신 처리해주는 wrapper 객체를 따로 만드는 것
## 플라이웨이트 (Flyweight)
 - 다수의 객체에 공통적인 데이터를 별도로 관리하여 메모리 효율을 높여주는 패턴
## 프록시 (Proxy)
 - 객체 스스로가 직접 처리하지 않고 중간에 다른 '숨겨진' 객체를 통해 처리하는 패턴
 1. 원격지 프록시
  - 서버 측에 있는 실제 객체와 같은 인터페이스를 갖는 원격지 객체를 제공하여 서버측에 있는 실제 객체를 제어하는 패턴
 2. 가상 프록시
  - 시간이 많이 걸리는 작업을 비동기적으로 사용하여주는 패턴
 3. 보호용 프록시
  - 사용자가 객체의 특정 행위를 수행할 수 있는 권한을 다르게 해주는 패턴

# 행위 패턴
 - 객체나 클래스 사이의 알고리즘이나 책임 분배에 관련된 패턴
 - 한 객체가 혼자 수행할 수 없는 작업을 여러 개의 객체로 어떻게 분배하는지와 객체 사이읭 결합도를 최소화 하는 것에 중점

## 책임연쇄 (Chain of Responsibility)
 - 명령하는 객체와 처리하는 객체를 일반화 하고 서로 연결하여, 명령객체에서 보낸 메시지가 내부적으로 연결된 처리 객체에 전달되도록 하는 패턴
## 명령 (Command)
 - 명령을 내리는 곳에서 수행할 명령 자체를 객체로 만들어 잔달하여, 해당 명령을 수행하는 패턴
## 인터프리터 (Interpreter)
 - 일련의 규칙으로 정의된 문법적 언어를 해석하는 패턴
## 반복자 (Iterator)
 - 컬렉션의 내부 표현을 외부에 노출하지 않고, 컬렉션의 요소들을 차레대로 접근하는 패턴
## 중재자 (Mediator)
 - 객체들간의 상호작용이 복잡할 때 중간자를 정의하여 관계를 단순화 하는 패턴
## 메멘토 (Memento)
 - 객체의 상태를 기록해 놓고 필요한 경우 복원할 수 있는 패턴
## 옵저버 (Observer)
 - 다른 객체들의 상태가 변하는것을 감시하는 패턴
## 상태 (State)
 - 객체의 상태에 따라 행동을 다르게 하는 패턴
## 전략 (Strategy)
 - 하나의 문제를 해결하기 위한 여러 객체를 일반화 하여 독립적으로 사용할 수 있게 하는 패턴
## 템플릿 메서드 (Template method)
 - 행위에 대한 약속을 기반 클래스에서하고 구체적 구현을 파생 클래스에서 하는 패턴
## 방문자 (Visitor)
 - 객체 종류에 따라 다른 처리를 하는 패턴