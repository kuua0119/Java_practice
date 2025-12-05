class Bicycle {
  private String name;
  
  // インスタンスの生成時にフィールドに値をセットできるよう、コンストラクタを用意
  Bicycle(String name) {
    this.name = name;
  }
  
  // Mainクラスからnameフィールドの値を取得するためにゲッターを定義
  public String getName() {
    return this.name;
  }
}