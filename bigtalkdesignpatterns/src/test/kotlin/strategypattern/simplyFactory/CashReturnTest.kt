package strategypattern.simplyFactory

import org.junit.*

/**
 * @author mrdonkey
 * @create on 2020/5/19 23:29
 * @description TODO
 */
internal class CashReturnTest {

    lateinit var cashReturn: CashReturn

    @Before
    fun setUp() {
         cashReturn = CashReturn(300.0,100.0)
    }

    @After
    fun tearDown() {
    }

    @Test
    fun acceptCash() {
       println(cashReturn.acceptCash(500.0))
    }
}