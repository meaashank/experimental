package K6;

import android.content.Context;
import android.content.Intent;
import android.view.ViewGroup;
import com.prism.fusionadsdk.internal.activity.NativeIntersitialActivityParams;
import com.prism.fusionadsdk.internal.activity.NativeInterstitialBaseActivity;

/* JADX INFO: loaded from: classes6.dex */
public class e extends J6.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f58417c = com.prism.fusionadsdkbase.a.f162373j.concat(e.class.getSimpleName());

    @Override // J6.c
    public void c(Context context, ViewGroup viewGroup) {
        NativeIntersitialActivityParams nativeIntersitialActivityParams = new NativeIntersitialActivityParams(context.getApplicationInfo().loadLabel(context.getPackageManager()).toString(), context.getApplicationInfo().icon);
        String string = Double.toString(Math.random());
        nativeIntersitialActivityParams.f162254b = string;
        L6.a.d(string, this.f53199b.q());
        L6.a.e(nativeIntersitialActivityParams.f162254b, this);
        Intent intent = new Intent(context, (Class<?>) NativeInterstitialBaseActivity.class);
        intent.addFlags(268435456);
        intent.putExtra(NativeInterstitialBaseActivity.f162260i, nativeIntersitialActivityParams);
        context.startActivity(intent);
    }
}
