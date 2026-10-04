package U9;

import android.view.View;
import com.android.launcher3.Launcher;
import com.android.launcher3.extension.OptionsPopupViewExtension;
import com.android.launcher3.views.OptionsPopupView;
import com.app.hider.master.promax.R;
import com.prism.gaia.naked.core.InitOnce;
import com.prism.hider.ui.C4209f1;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class k1 implements OptionsPopupViewExtension {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static InitOnce<k1> f74086b = new InitOnce<>(new j1());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Launcher f74087a;

    public static /* synthetic */ boolean b(k1 k1Var, View view) {
        k1Var.f(view);
        return true;
    }

    public static k1 c() {
        return new k1();
    }

    public static OptionsPopupViewExtension d() {
        return f74086b.get();
    }

    public final boolean e(View view) {
        ca.c cVarC = ea.l.d().c("hider.setting");
        if (cVarC == null) {
            return false;
        }
        cVarC.onLaunch(this.f74087a);
        return true;
    }

    public final boolean f(View view) {
        new C4209f1().show(this.f74087a.getSupportFragmentManager(), "wallpaper");
        return true;
    }

    @Override // com.android.launcher3.extension.OptionsPopupViewExtension
    public void onShowDefaultOptions(Launcher launcher, List<OptionsPopupView.OptionItem> list) {
        this.f74087a = launcher;
        list.add(new OptionsPopupView.OptionItem(R.string.module_name_setting, R.drawable.ic_setting, 4, new View.OnLongClickListener() { // from class: U9.h1
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f74074a.e(view);
            }
        }));
        list.add(new OptionsPopupView.OptionItem(R.string.wallpaper_button_text, R.drawable.ic_wallpaper, 3, new View.OnLongClickListener() { // from class: U9.i1
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                k1.b(this.f74078a, view);
                return true;
            }
        }));
    }
}
