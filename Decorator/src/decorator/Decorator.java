package decorator;

import model.Pizza;

public abstract class Decorator extends Pizza {
    // Kuncinya ada di class "Decorator" sebagai penegngah
    // antar class tambahan topping (Beef) dengan class utama (Pizza)
    protected String topping;

}
