package intermediate;

// 클래스 뒤에 꺽쇄 괄호 E로 제너릭 선언
// 선언 시 가상의 타입
public class Box<E> {

    // 타입을 E로 바꿔준다
    private E obj;

    public void setObj(E obj){
        this.obj = obj;
    }

    public E getObj() {
        return obj;
    }
}
