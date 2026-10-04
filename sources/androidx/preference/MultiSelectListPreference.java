package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.preference.Preference;
import androidx.preference.w;
import e.InterfaceC4331e;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class MultiSelectListPreference extends DialogPreference {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public CharSequence[] f115452Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public CharSequence[] f115453a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public Set<String> f115454b0;

    public MultiSelectListPreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f115454b0 = new HashSet();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w.k.f115888F, i10, i11);
        this.f115452Z = D0.n.q(typedArrayObtainStyledAttributes, w.k.f115897I, w.k.f115891G);
        int i12 = w.k.f115900J;
        int i13 = w.k.f115894H;
        CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(i12);
        this.f115453a0 = textArray == null ? typedArrayObtainStyledAttributes.getTextArray(i13) : textArray;
        typedArrayObtainStyledAttributes.recycle();
    }

    public int E1(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.f115453a0) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (TextUtils.equals(this.f115453a0[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    public CharSequence[] F1() {
        return this.f115452Z;
    }

    public CharSequence[] G1() {
        return this.f115453a0;
    }

    public boolean[] H1() {
        CharSequence[] charSequenceArr = this.f115453a0;
        int length = charSequenceArr.length;
        Set<String> set = this.f115454b0;
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            zArr[i10] = set.contains(charSequenceArr[i10].toString());
        }
        return zArr;
    }

    public Set<String> I1() {
        return this.f115454b0;
    }

    public void J1(@InterfaceC4331e int i10) {
        K1(i().getResources().getTextArray(i10));
    }

    public void K1(CharSequence[] charSequenceArr) {
        this.f115452Z = charSequenceArr;
    }

    public void L1(@InterfaceC4331e int i10) {
        M1(i().getResources().getTextArray(i10));
    }

    public void M1(CharSequence[] charSequenceArr) {
        this.f115453a0 = charSequenceArr;
    }

    public void N1(Set<String> set) {
        this.f115454b0.clear();
        this.f115454b0.addAll(set);
        x0(set);
        X();
    }

    @Override // androidx.preference.Preference
    @Nullable
    public Object h0(@NonNull TypedArray typedArray, int i10) {
        CharSequence[] textArray = typedArray.getTextArray(i10);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    @Override // androidx.preference.Preference
    public void l0(@Nullable Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.l0(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.l0(savedState.getSuperState());
        N1(savedState.mValues);
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
        savedState.mValues = I1();
        return savedState;
    }

    @Override // androidx.preference.Preference
    public void n0(Object obj) {
        N1(D((Set) obj));
    }

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        Set<String> mValues;

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
            int i10 = parcel.readInt();
            this.mValues = new HashSet();
            String[] strArr = new String[i10];
            parcel.readStringArray(strArr);
            Collections.addAll(this.mValues, strArr);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.mValues.size());
            Set<String> set = this.mValues;
            parcel.writeStringArray((String[]) set.toArray(new String[set.size()]));
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public MultiSelectListPreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public MultiSelectListPreference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, D0.n.a(context, w.a.f115778k, R.attr.dialogPreferenceStyle), 0);
    }

    public MultiSelectListPreference(@NonNull Context context) {
        this(context, null);
    }
}
