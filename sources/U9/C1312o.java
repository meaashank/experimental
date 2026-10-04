package U9;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.HandlerThread;
import android.os.Looper;
import com.android.launcher3.AppInfo;
import com.android.launcher3.BubbleTextView;
import com.android.launcher3.ShortcutInfo;
import com.android.launcher3.extension.BubbleTextViewExtension;
import com.android.launcher3.util.LooperExecutor;
import com.prism.commons.utils.C3861z;
import e.InterfaceC4337k;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import v8.C5714x;

/* JADX INFO: renamed from: U9.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C1312o implements BubbleTextViewExtension {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f74117e = 1.36364f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f74118f = 0.3181822f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f74119g = 0.68182f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final float f74120h = -0.2f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final float f74121i = -0.14286f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final float f74122j = 0.204546f;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final HandlerThread f74128p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Executor f74129q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Executor f74130r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f74131a = new Paint(3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C3861z<String, Context> f74132b = new C3861z<>(new C1306l());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C3861z<String, Context> f74133c = new C3861z<>(new C1308m());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static C1294f f74116d = C1294f.e();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @InterfaceC4337k
    public static int f74123k = -15433001;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @InterfaceC4337k
    public static int f74124l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @InterfaceC4337k
    public static int f74125m = -9408400;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @InterfaceC4337k
    public static int f74126n = -15198184;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static Map<String, InterfaceC1300i> f74127o = new HashMap();

    static {
        HandlerThread handlerThread = new HandlerThread("icon-updater");
        f74128p = handlerThread;
        f74127o.put(V9.d.f76403c, new V9.d());
        f74127o.put(V9.b.f76396c, new V9.b());
        handlerThread.start();
        f74129q = new LooperExecutor(handlerThread.getLooper());
        f74130r = new LooperExecutor(Looper.getMainLooper());
    }

    public static /* synthetic */ void b(final BubbleTextView bubbleTextView) {
        Object tag = bubbleTextView.getTag();
        if (tag instanceof AppInfo) {
            if (C5714x.j().Q(((AppInfo) tag).getDecodedPkgName())) {
                f74130r.execute(new Runnable() { // from class: U9.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        bubbleTextView.setBackgroundColor(-3355444);
                    }
                });
            } else {
                f74130r.execute(new Runnable() { // from class: U9.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        bubbleTextView.setBackgroundResource(0);
                    }
                });
            }
        }
    }

    @Override // com.android.launcher3.extension.BubbleTextViewExtension
    public void afterApplyFromAppInfo(final BubbleTextView bubbleTextView) {
        f74129q.execute(new Runnable() { // from class: U9.n
            @Override // java.lang.Runnable
            public final void run() {
                C1312o.b(bubbleTextView);
            }
        });
    }

    @Override // com.android.launcher3.extension.BubbleTextViewExtension
    public void onDrawBadge(BubbleTextView bubbleTextView, Canvas canvas, Rect rect, Point point) {
        InterfaceC1300i interfaceC1300i;
        ShortcutInfo shortcutInfo = (ShortcutInfo) com.prism.hider.utils.l.a(bubbleTextView, ShortcutInfo.class);
        if (shortcutInfo == null) {
            return;
        }
        Context context = bubbleTextView.getContext();
        String packageNameInComponent = shortcutInfo.getPackageNameInComponent();
        if (!com.prism.hider.utils.c.i(packageNameInComponent)) {
            String strB = com.prism.hider.utils.m.b(shortcutInfo);
            if (strB == null || (interfaceC1300i = f74127o.get(strB)) == null) {
                return;
            }
            interfaceC1300i.onDrawBadge(bubbleTextView, canvas, rect, point);
            return;
        }
        String strA = com.prism.hider.utils.c.a(packageNameInComponent);
        int i10 = f74123k;
        int i11 = f74124l;
        String strA2 = this.f74132b.a(context);
        if (!f74116d.d(strA)) {
            i10 = f74125m;
            i11 = f74126n;
            strA2 = this.f74133c.a(context);
        }
        int vuserId = shortcutInfo.getVuserId();
        if (vuserId != 0) {
            StringBuilder sbA = androidx.compose.runtime.changelist.a.a(strA2);
            sbA.append(vuserId + 1);
            strA2 = sbA.toString();
        }
        double dHeight = (((double) rect.height()) + 0.0d) * 0.31818220019340515d;
        double dWidth = (((double) rect.width()) + 0.0d) * 0.6818199753761292d;
        int i12 = rect.right;
        float f10 = i12 + ((float) ((-0.20000000298023224d) * dWidth));
        int i13 = rect.bottom;
        double d10 = dWidth / 2.0d;
        float f11 = (float) (((double) (point.x + i12)) - d10);
        double d11 = dHeight / 2.0d;
        float f12 = (float) (((double) (point.y + i13)) - d11);
        float fMin = Math.min(f10, f11);
        float fMin2 = Math.min(i13 + ((float) (dHeight * (-0.14285999536514282d))), f12);
        double d12 = fMin;
        double d13 = fMin2;
        float f13 = ((float) dHeight) * 0.5f;
        RectF rectF = new RectF((float) (d12 - d10), (float) (d13 - d11), (float) (d12 + d10), (float) (d13 + d11));
        this.f74131a.setColor(i10);
        canvas.drawRoundRect(rectF, f13, f13, this.f74131a);
        this.f74131a.setColor(i11);
        this.f74131a.setTextAlign(Paint.Align.CENTER);
        this.f74131a.setTextSize(rect.width() * 0.204546f);
        Paint.FontMetrics fontMetrics = this.f74131a.getFontMetrics();
        canvas.drawText(strA2, fMin, fMin2 - ((fontMetrics.top + fontMetrics.bottom) / 2.0f), this.f74131a);
    }
}
