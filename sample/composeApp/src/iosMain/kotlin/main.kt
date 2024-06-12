import androidx.compose.ui.window.ComposeUIViewController
import com.client.mvicompose.App
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController = ComposeUIViewController { App() }
