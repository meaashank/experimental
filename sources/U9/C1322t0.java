package U9;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.util.Log;
import android.view.View;
import com.android.launcher3.AppInfo;
import com.android.launcher3.BubbleTextView;
import com.android.launcher3.Launcher;
import com.android.launcher3.PromiseAppInfo;
import com.android.launcher3.ShortcutInfo;
import com.android.launcher3.extension.OnDropExtension;
import com.app.hider.master.promax.R;

/* JADX INFO: renamed from: U9.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C1322t0 implements OnDropExtension {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f74152g = com.prism.commons.utils.l0.b(C1322t0.class.getSimpleName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f74153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AppInfo f74154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PromiseAppInfo f74155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ShortcutInfo f74156d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public BubbleTextView f74157e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Launcher f74158f;

    public C1322t0(Context context, Launcher launcher) {
        this.f74153a = context;
        this.f74158f = launcher;
    }

    public final /* synthetic */ void d(DialogInterface dialogInterface, int i10) {
        D.g().b().K(this.f74155c);
        dialogInterface.dismiss();
    }

    public final /* synthetic */ void e(DialogInterface dialogInterface, int i10) {
        this.f74158f.removeItem(this.f74157e, this.f74156d, true);
        dialogInterface.dismiss();
    }

    @Override // com.android.launcher3.extension.OnDropExtension
    public void onDrop() {
        if (this.f74153a == null || this.f74155c == null || this.f74156d == null || this.f74157e == null || this.f74158f == null) {
            return;
        }
        if (Z6.g.B().C(this.f74154b.getDecodedPkgName())) {
            new AlertDialog.Builder(this.f74158f).setMessage(R.string.mesg_forbid_import_app_require_secure_env_gp).setNegativeButton(R.string.text_confirm, new DialogInterfaceOnClickListenerC1317q0()).create().show();
            this.f74158f.removeItem(this.f74157e, this.f74156d, true);
            return;
        }
        Log.d(f74152g, "promiseAppInfo packageName:" + this.f74155c.packageName);
        com.prism.hider.ui.I i10 = new com.prism.hider.ui.I(this.f74157e.getContext());
        i10.w(this.f74154b);
        i10.f168290k = new DialogInterface.OnClickListener() { // from class: U9.r0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                this.f74143a.d(dialogInterface, i11);
            }
        };
        i10.f168291l = new DialogInterface.OnClickListener() { // from class: U9.s0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                this.f74145a.e(dialogInterface, i11);
            }
        };
        i10.E(this.f74157e.getContext());
    }

    @Override // com.android.launcher3.extension.OnDropExtension
    public AppInfo prepareAppInfo(AppInfo appInfo) {
        if (appInfo == null) {
            return null;
        }
        this.f74154b = appInfo;
        l1 l1Var = new l1(appInfo);
        this.f74155c = l1Var;
        return l1Var;
    }

    @Override // com.android.launcher3.extension.OnDropExtension
    public ShortcutInfo prepareShortcutInfo(ShortcutInfo shortcutInfo) {
        this.f74156d = shortcutInfo;
        return shortcutInfo;
    }

    @Override // com.android.launcher3.extension.OnDropExtension
    public View prepareShortcutView(View view) {
        if (!(view instanceof BubbleTextView)) {
            return view;
        }
        BubbleTextView bubbleTextView = (BubbleTextView) view;
        this.f74157e = bubbleTextView;
        return bubbleTextView;
    }
}
