package builderpattern

/**
 * @create on 2020/6/1 23:38
 * @description 指挥者类，用来指挥建造过程
 * @author mrdonkey
 */
class Director {

    fun construct(builder: Builder) {
        builder.builderComponentA()
        builder.builderComponentB()
    }
}