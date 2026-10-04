package S3;

import T3.a;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Message;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import com.cookiegames.smartcookie.browser.C;
import com.cookiegames.smartcookie.dialog.LightningDialogBuilder;
import com.cookiegames.smartcookie.view.SmartCookieView;
import e.InterfaceC4337k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface b {

    public static final class a {
    }

    void B0(@Nullable String str, @NotNull String str2);

    boolean C();

    void D0();

    void F(int i10);

    void I(@Nullable Bitmap bitmap, @Nullable Drawable drawable);

    void L(@NotNull Message message);

    void N(@NotNull ValueCallback<Uri[]> valueCallback);

    void O();

    void T(@NotNull SmartCookieView smartCookieView);

    void V(@NotNull a.C0110a c0110a);

    void Z();

    void a(boolean z10);

    void b(@Nullable String str, boolean z10);

    void b0(@NotNull LightningDialogBuilder.NewTab newTab, @NotNull String str, boolean z10);

    void e0(@NotNull SmartCookieView smartCookieView);

    void f(int i10);

    void g(boolean z10);

    void h0(@NotNull View view, @NotNull WebChromeClient.CustomViewCallback customViewCallback, int i10);

    void i(@NotNull T3.a aVar);

    void k();

    void k0();

    void l0();

    void n();

    @NotNull
    C n0();

    void o(@NotNull ValueCallback<Uri> valueCallback);

    void p0(int i10);

    void r(int i10);

    void r0(@Nullable Drawable drawable);

    void s();

    void t();

    void t0();

    void u();

    void w();

    @InterfaceC4337k
    int x0();
}
