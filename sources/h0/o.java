package H0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f45447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Drawable.ConstantState f45448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ColorStateList f45449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public PorterDuff.Mode f45450d;

    public o(@Nullable o oVar) {
        this.f45449c = null;
        this.f45450d = m.f45438g;
        if (oVar != null) {
            this.f45447a = oVar.f45447a;
            this.f45448b = oVar.f45448b;
            this.f45449c = oVar.f45449c;
            this.f45450d = oVar.f45450d;
        }
    }

    public boolean a() {
        return this.f45448b != null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        int i10 = this.f45447a;
        Drawable.ConstantState constantState = this.f45448b;
        return i10 | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    @NonNull
    public Drawable newDrawable() {
        return new n(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    @NonNull
    public Drawable newDrawable(@Nullable Resources resources) {
        return new n(this, resources);
    }
}
