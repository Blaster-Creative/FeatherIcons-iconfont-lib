package il.co.blaster.feathericonslibsample

import il.co.blaster.feathericonslib.FeatherIcons
import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun testGlyphs(){
        val s = FeatherIcons.glyph(FeatherIcons.Glyphs.feather_arrow_down)
        val f = FeatherIcons.Glyphs.feather_arrow_down
        print("s = $s, f = $f")
    }
}
