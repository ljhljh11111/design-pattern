package com.example;

import com.example.pattern.DoubleCheckSingleton;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {
        DoubleCheckSingleton instance = DoubleCheckSingleton.getInstance();
        instance.doSomething();
    }
}

//选择哪种单例实现取决于业务场景：
//若需绝对安全（防止反射 / 序列化），选枚举单例；
//若需延迟加载且性能优先，选双重检查锁或静态内部类；
//若对内存消耗不敏感，饿汉式简单易用。