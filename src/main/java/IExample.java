interface IExample1 {
}
interface IExample2 {
}
interface IExample3 {
}


public interface IExample extends IExample1, IExample2, IExample3 {
    void test();
}