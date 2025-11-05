package com.example.pattern;

import java.util.HashMap;
import java.util.Map;

/**
 * 原型管理器 - 管理原型对象，实现原型的注册和获取
 * 提供一种访问原型的方式，客户端无需直接创建原型对象
 */
public class PrototypeManager {
    // 使用Map存储原型对象
    private Map<String, Prototype> prototypeMap = new HashMap<>();
    
    // 单例模式，确保只有一个原型管理器实例
    private static PrototypeManager instance = new PrototypeManager();
    
    /**
     * 私有构造方法，防止外部实例化
     */
    private PrototypeManager() {
    }
    
    /**
     * 获取原型管理器实例
     * @return 原型管理器实例
     */
    public static PrototypeManager getInstance() {
        return instance;
    }
    
    /**
     * 注册原型对象
     * @param key 原型对象的键
     * @param prototype 原型对象
     */
    public void register(String key, Prototype prototype) {
        prototypeMap.put(key, prototype);
    }
    
    /**
     * 根据键获取原型对象的克隆
     * @param key 原型对象的键
     * @return 克隆出的对象
     */
    public Prototype get(String key) {
        Prototype prototype = prototypeMap.get(key);
        if (prototype != null) {
            return (Prototype) prototype.clone();
        }
        return null;
    }
    
    /**
     * 取消注册原型对象
     * @param key 原型对象的键
     */
    public void unregister(String key) {
        prototypeMap.remove(key);
    }
    
    /**
     * 获取所有注册的原型键
     * @return 原型键的数组
     */
    public String[] getAllKeys() {
        return prototypeMap.keySet().toArray(new String[0]);
    }
}