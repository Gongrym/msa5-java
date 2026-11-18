package org.example.e06oop;

// 접근제어 지시자
public class AccessModifier {

    // default : 같은 패키지에 소속 된 클래스에서만 접근 가능
    String strDefault = "Default";

    // public : 클래스 내/외부 어디에서나 접근 가능
    public String strPublic = "Public";

    // private : 클래스 내부에서만 접근 가능
    private String strPrivate = "Private";

    // protected : 상속 관계에서 내 자식 클래스와 나 자신만 사용 가능 + 같은 패키지 내부도 가능
    protected String strProtected = "Protected";

    void fnDefault() {
        System.out.println("Default Fn");
    }

    public void fnPublic() {
        System.out.println("Public Fn");
    }

    private void fnPrivate() {
        System.out.println("private Fn");
    }

    protected void fnProtected() {
        System.out.println("Protected Fn");
    }
}