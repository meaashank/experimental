package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.collection.U0;
import androidx.preference.Preference;
import androidx.preference.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PreferenceGroup extends Preference {

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final String f115502c0 = "PreferenceGroup";

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final U0<String, Long> f115503T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final Handler f115504U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final List<Preference> f115505V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public boolean f115506W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public int f115507X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f115508Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public int f115509Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public b f115510a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Runnable f115511b0;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                PreferenceGroup.this.f115503T.clear();
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public interface b {
        void a();
    }

    public interface c {
        int c(@NonNull Preference preference);

        int e(@NonNull String str);
    }

    public PreferenceGroup(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f115503T = new U0<>();
        this.f115504U = new Handler(Looper.getMainLooper());
        this.f115506W = true;
        this.f115507X = 0;
        this.f115508Y = false;
        this.f115509Z = Integer.MAX_VALUE;
        this.f115510a0 = null;
        this.f115511b0 = new a();
        this.f115505V = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w.k.f115889F0, i10, i11);
        int i12 = w.k.f115898I0;
        this.f115506W = D0.n.b(typedArrayObtainStyledAttributes, i12, i12, true);
        int i13 = w.k.f115895H0;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            C1(typedArrayObtainStyledAttributes.getInt(i13, typedArrayObtainStyledAttributes.getInt(i13, Integer.MAX_VALUE)));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final boolean A1(@NonNull Preference preference) {
        boolean zRemove;
        synchronized (this) {
            try {
                preference.k0();
                if (preference.x() == this) {
                    preference.a(null);
                }
                zRemove = this.f115505V.remove(preference);
                if (zRemove) {
                    String strS = preference.s();
                    if (strS != null) {
                        this.f115503T.put(strS, Long.valueOf(preference.p()));
                        this.f115504U.removeCallbacks(this.f115511b0);
                        this.f115504U.post(this.f115511b0);
                    }
                    if (this.f115508Y) {
                        preference.g0();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zRemove;
    }

    public boolean B1(@NonNull CharSequence charSequence) {
        Preference preferenceP1 = p1(charSequence);
        if (preferenceP1 == null) {
            return false;
        }
        return preferenceP1.x().z1(preferenceP1);
    }

    public void C1(int i10) {
        if (i10 != Integer.MAX_VALUE && !M()) {
            Log.e(f115502c0, getClass().getSimpleName().concat(" should have a key defined if it contains an expandable preference"));
        }
        this.f115509Z = i10;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void D1(@Nullable b bVar) {
        this.f115510a0 = bVar;
    }

    public void E1(boolean z10) {
        this.f115506W = z10;
    }

    public void F1() {
        synchronized (this) {
            Collections.sort(this.f115505V);
        }
    }

    @Override // androidx.preference.Preference
    public void Y(boolean z10) {
        super.Y(z10);
        int iT1 = t1();
        for (int i10 = 0; i10 < iT1; i10++) {
            s1(i10).j0(this, z10);
        }
    }

    @Override // androidx.preference.Preference
    public void a0() {
        y0();
        this.f115508Y = true;
        int iT1 = t1();
        for (int i10 = 0; i10 < iT1; i10++) {
            s1(i10).a0();
        }
    }

    @Override // androidx.preference.Preference
    public void e(@NonNull Bundle bundle) {
        super.e(bundle);
        int iT1 = t1();
        for (int i10 = 0; i10 < iT1; i10++) {
            s1(i10).e(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public void f(@NonNull Bundle bundle) {
        super.f(bundle);
        int iT1 = t1();
        for (int i10 = 0; i10 < iT1; i10++) {
            s1(i10).f(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public void g0() {
        super.g0();
        this.f115508Y = false;
        int iT1 = t1();
        for (int i10 = 0; i10 < iT1; i10++) {
            s1(i10).g0();
        }
    }

    @Override // androidx.preference.Preference
    public void l0(@Nullable Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.l0(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f115509Z = savedState.mInitialExpandedChildrenCount;
        super.l0(savedState.getSuperState());
    }

    @Override // androidx.preference.Preference
    @NonNull
    public Parcelable m0() {
        super.m0();
        return new SavedState(AbsSavedState.EMPTY_STATE, this.f115509Z);
    }

    public void n1(@NonNull Preference preference) {
        o1(preference);
    }

    public boolean o1(@NonNull Preference preference) {
        long jH;
        if (this.f115505V.contains(preference)) {
            return true;
        }
        if (preference.s() != null) {
            PreferenceGroup preferenceGroupX = this;
            while (preferenceGroupX.x() != null) {
                preferenceGroupX = preferenceGroupX.x();
            }
            String strS = preference.s();
            if (preferenceGroupX.p1(strS) != null) {
                Log.e(f115502c0, "Found duplicated key: \"" + strS + "\". This can cause unintended behaviour, please use unique keys for every preference.");
            }
        }
        if (preference.w() == Integer.MAX_VALUE) {
            if (this.f115506W) {
                int i10 = this.f115507X;
                this.f115507X = i10 + 1;
                preference.S0(i10);
            }
            if (preference instanceof PreferenceGroup) {
                ((PreferenceGroup) preference).E1(this.f115506W);
            }
        }
        int iBinarySearch = Collections.binarySearch(this.f115505V, preference);
        if (iBinarySearch < 0) {
            iBinarySearch = (iBinarySearch * (-1)) - 1;
        }
        x1(preference);
        synchronized (this) {
            this.f115505V.add(iBinarySearch, preference);
        }
        t tVarF = F();
        String strS2 = preference.s();
        if (strS2 == null || !this.f115503T.containsKey(strS2)) {
            jH = tVarF.h();
        } else {
            jH = this.f115503T.get(strS2).longValue();
            this.f115503T.remove(strS2);
        }
        preference.c0(tVarF, jH);
        preference.a(this);
        if (this.f115508Y) {
            preference.a0();
        }
        Z();
        return true;
    }

    @Nullable
    public <T extends Preference> T p1(@NonNull CharSequence charSequence) {
        T t10;
        if (charSequence == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }
        if (TextUtils.equals(s(), charSequence)) {
            return this;
        }
        int iT1 = t1();
        for (int i10 = 0; i10 < iT1; i10++) {
            PreferenceGroup preferenceGroup = (T) s1(i10);
            if (TextUtils.equals(preferenceGroup.s(), charSequence)) {
                return preferenceGroup;
            }
            if ((preferenceGroup instanceof PreferenceGroup) && (t10 = (T) preferenceGroup.p1(charSequence)) != null) {
                return t10;
            }
        }
        return null;
    }

    public int q1() {
        return this.f115509Z;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public b r1() {
        return this.f115510a0;
    }

    @NonNull
    public Preference s1(int i10) {
        return this.f115505V.get(i10);
    }

    public int t1() {
        return this.f115505V.size();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean u1() {
        return this.f115508Y;
    }

    public boolean v1() {
        return !(this instanceof PreferenceScreen);
    }

    public boolean w1() {
        return this.f115506W;
    }

    public boolean x1(@NonNull Preference preference) {
        preference.j0(this, h1());
        return true;
    }

    public void y1() {
        synchronized (this) {
            try {
                List<Preference> list = this.f115505V;
                for (int size = list.size() - 1; size >= 0; size--) {
                    A1(list.get(0));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Z();
    }

    public boolean z1(@NonNull Preference preference) {
        boolean zA1 = A1(preference);
        Z();
        return zA1;
    }

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        int mInitialExpandedChildrenCount;

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
            this.mInitialExpandedChildrenCount = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.mInitialExpandedChildrenCount);
        }

        public SavedState(Parcelable parcelable, int i10) {
            super(parcelable);
            this.mInitialExpandedChildrenCount = i10;
        }
    }

    public PreferenceGroup(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
    }

    public PreferenceGroup(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }
}
