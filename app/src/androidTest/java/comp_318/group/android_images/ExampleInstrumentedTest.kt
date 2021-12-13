/** Group 3: Software Devices 
 * Image Segmentation
 * Student name:
 * Rjaofera Tiana Andriamasinalivao
 * Burhan Jawed
 * Kateryna Khomenko
 * Oksana Koshulap
 */
package comp_318.group.android_images

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("comp_318.group.android_images", appContext.packageName)
    }
}