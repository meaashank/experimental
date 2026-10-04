package Ba;

import B0.C0920d;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.prism.lib.feedback.config.InteractiveConfig;
import e.InterfaceC4346u;
import e.Z;

/* JADX INFO: loaded from: classes6.dex */
public abstract class d extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Z
    public int f17456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Z
    public int f17457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @InterfaceC4346u
    public int f17458d;

    public d(InteractiveConfig interactiveConfig, @Z int i10, @Z int i11, @InterfaceC4346u int i12) {
        super(interactiveConfig);
        this.f17456b = i10;
        this.f17457c = i11;
        this.f17458d = i12;
    }

    @Override // Aa.b
    public String a(Context context) {
        return context.getString(this.f17456b);
    }

    @Override // Aa.b
    public Drawable c(Context context) {
        return C0920d.getDrawable(context, this.f17458d);
    }

    @Override // Aa.b
    public String d() {
        return f().method;
    }

    @Override // Aa.b
    public String e(Context context) {
        return context.getString(this.f17457c);
    }
}
