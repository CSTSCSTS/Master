package jp.co.up.level.chaen;

public class Instance {

	public static void main(String[] args) {
		InstanceChaen a = new InstanceChaen();
		InstanceChaen b = new InstanceChaen();
//クラス変数（またはメンバ変数やフィールドともいう）(ここでいうstaticVar)はクラスに対して割り当てられているので、
	//どこかが変わると、全部変わる
		a.instanceVar = 10;
		a.staticVar = 20;
		System.out.println("a.instanceVar="+ a.instanceVar);
		System.out.println("a.staticVar ="+ a.staticVar);
		System.out.println("b.instanceVar="+ b.instanceVar);
		System.out.println("b.staticVar ="+ b.staticVar);
		System.out.println("InstanceChaen.staticVar ="+ InstanceChaen.staticVar);



	}

}
