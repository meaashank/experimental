package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.preference.Preference;

/* JADX INFO: loaded from: classes2.dex */
public abstract class TwoStatePreference extends Preference {

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public boolean f115537T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public CharSequence f115538U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public CharSequence f115539V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public boolean f115540W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public boolean f115541X;

    public TwoStatePreference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
    }

    @Override // androidx.preference.Preference
    public void e0() {
        boolean z10 = !q1();
        if (b(Boolean.valueOf(z10))) {
            r1(z10);
        }
    }

    @Override // androidx.preference.Preference
    @Nullable
    public Object h0(@NonNull TypedArray typedArray, int i10) {
        return Boolean.valueOf(typedArray.getBoolean(i10, false));
    }

    @Override // androidx.preference.Preference
    public boolean h1() {
        return (this.f115541X ? this.f115537T : !this.f115537T) || super.h1();
    }

    @Override // androidx.preference.Preference
    public void l0(@Nullable Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.l0(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.l0(savedState.getSuperState());
        r1(savedState.mChecked);
    }

    @Override // androidx.preference.Preference
    @Nullable
    public Parcelable m0() {
        super.m0();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (R()) {
            return absSavedState;
        }
        SavedState savedState = new SavedState(absSavedState);
        savedState.mChecked = q1();
        return savedState;
    }

    @Override // androidx.preference.Preference
    public void n0(Object obj) {
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        r1(y(((Boolean) obj).booleanValue()));
    }

    public boolean n1() {
        return this.f115541X;
    }

    @Nullable
    public CharSequence o1() {
        return this.f115539V;
    }

    @Nullable
    public CharSequence p1() {
        return this.f115538U;
    }

    public boolean q1() {
        return this.f115537T;
    }

    public void r1(boolean z10) {
        boolean z11 = this.f115537T != z10;
        if (z11 || !this.f115540W) {
            this.f115537T = z10;
            this.f115540W = true;
            s0(z10);
            if (z11) {
                Y(h1());
                X();
            }
        }
    }

    public void s1(boolean z10) {
        this.f115541X = z10;
    }

    public void t1(int i10) {
        u1(i().getString(i10));
    }

    public void u1(@Nullable CharSequence charSequence) {
        this.f115539V = charSequence;
        if (q1()) {
            return;
        }
        X();
    }

    public void v1(int i10) {
        w1(i().getString(i10));
    }

    public void w1(@Nullable CharSequence charSequence) {
        this.f115538U = charSequence;
        if (q1()) {
            X();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void x1(android.view.View r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof android.widget.TextView
            if (r0 != 0) goto L5
            goto L4c
        L5:
            android.widget.TextView r5 = (android.widget.TextView) r5
            boolean r0 = r4.f115537T
            r1 = 0
            if (r0 == 0) goto L1b
            java.lang.CharSequence r0 = r4.f115538U
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1b
            java.lang.CharSequence r0 = r4.f115538U
            r5.setText(r0)
        L19:
            r0 = r1
            goto L2e
        L1b:
            boolean r0 = r4.f115537T
            if (r0 != 0) goto L2d
            java.lang.CharSequence r0 = r4.f115539V
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L2d
            java.lang.CharSequence r0 = r4.f115539V
            r5.setText(r0)
            goto L19
        L2d:
            r0 = 1
        L2e:
            if (r0 == 0) goto L3e
            java.lang.CharSequence r2 = r4.I()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L3e
            r5.setText(r2)
            r0 = r1
        L3e:
            if (r0 != 0) goto L41
            goto L43
        L41:
            r1 = 8
        L43:
            int r0 = r5.getVisibility()
            if (r1 == r0) goto L4c
            r5.setVisibility(r1)
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.TwoStatePreference.x1(android.view.View):void");
    }

    public void y1(@NonNull v vVar) {
        x1(vVar.d(R.id.summary));
    }

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        boolean mChecked;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.mChecked = parcel.readInt() == 1;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.mChecked ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public TwoStatePreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10, 0);
    }

    public TwoStatePreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }

    public TwoStatePreference(@NonNull Context context) {
        this(context, null);
    }
}
