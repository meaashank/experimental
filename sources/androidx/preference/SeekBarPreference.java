package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.preference.Preference;
import androidx.preference.w;

/* JADX INFO: loaded from: classes2.dex */
public class SeekBarPreference extends Preference {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final String f115514f0 = "SeekBarPreference";

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public int f115515T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public int f115516U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public int f115517V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public int f115518W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public boolean f115519X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public SeekBar f115520Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public TextView f115521Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f115522a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f115523b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f115524c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final SeekBar.OnSeekBarChangeListener f115525d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final View.OnKeyListener f115526e0;

    public class a implements SeekBar.OnSeekBarChangeListener {
        public a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            if (z10) {
                SeekBarPreference seekBarPreference = SeekBarPreference.this;
                if (seekBarPreference.f115524c0 || !seekBarPreference.f115519X) {
                    seekBarPreference.C1(seekBar);
                    return;
                }
            }
            SeekBarPreference seekBarPreference2 = SeekBarPreference.this;
            seekBarPreference2.D1(i10 + seekBarPreference2.f115516U);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.f115519X = true;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.f115519X = false;
            int progress = seekBar.getProgress();
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if (progress + seekBarPreference.f115516U != seekBarPreference.f115515T) {
                seekBarPreference.C1(seekBar);
            }
        }
    }

    public class b implements View.OnKeyListener {
        public b() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0) {
                return false;
            }
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if ((!seekBarPreference.f115522a0 && (i10 == 21 || i10 == 22)) || i10 == 23 || i10 == 66) {
                return false;
            }
            SeekBar seekBar = seekBarPreference.f115520Y;
            if (seekBar != null) {
                return seekBar.onKeyDown(i10, keyEvent);
            }
            Log.e(SeekBarPreference.f115514f0, "SeekBar view is null and hence cannot be adjusted.");
            return false;
        }
    }

    public SeekBarPreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f115525d0 = new a();
        this.f115526e0 = new b();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w.k.f115955g1, i10, i11);
        this.f115516U = typedArrayObtainStyledAttributes.getInt(w.k.f115967k1, 0);
        v1(typedArrayObtainStyledAttributes.getInt(w.k.f115961i1, 100));
        x1(typedArrayObtainStyledAttributes.getInt(w.k.f115970l1, 0));
        this.f115522a0 = typedArrayObtainStyledAttributes.getBoolean(w.k.f115964j1, true);
        this.f115523b0 = typedArrayObtainStyledAttributes.getBoolean(w.k.f115973m1, false);
        this.f115524c0 = typedArrayObtainStyledAttributes.getBoolean(w.k.f115976n1, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    public void A1(int i10) {
        B1(i10, true);
    }

    public final void B1(int i10, boolean z10) {
        int i11 = this.f115516U;
        if (i10 < i11) {
            i10 = i11;
        }
        int i12 = this.f115517V;
        if (i10 > i12) {
            i10 = i12;
        }
        if (i10 != this.f115515T) {
            this.f115515T = i10;
            D1(i10);
            u0(i10);
            if (z10) {
                X();
            }
        }
    }

    public void C1(@NonNull SeekBar seekBar) {
        int progress = seekBar.getProgress() + this.f115516U;
        if (progress != this.f115515T) {
            if (b(Integer.valueOf(progress))) {
                B1(progress, false);
            } else {
                seekBar.setProgress(this.f115515T - this.f115516U);
                D1(this.f115515T);
            }
        }
    }

    public void D1(int i10) {
        TextView textView = this.f115521Z;
        if (textView != null) {
            textView.setText(String.valueOf(i10));
        }
    }

    @Override // androidx.preference.Preference
    public void d0(@NonNull v vVar) {
        super.d0(vVar);
        vVar.itemView.setOnKeyListener(this.f115526e0);
        this.f115520Y = (SeekBar) vVar.d(w.f.f115810f);
        TextView textView = (TextView) vVar.d(w.f.f115811g);
        this.f115521Z = textView;
        if (this.f115523b0) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.f115521Z = null;
        }
        SeekBar seekBar = this.f115520Y;
        if (seekBar == null) {
            Log.e(f115514f0, "SeekBar view is null in onBindViewHolder.");
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.f115525d0);
        this.f115520Y.setMax(this.f115517V - this.f115516U);
        int i10 = this.f115518W;
        if (i10 != 0) {
            this.f115520Y.setKeyProgressIncrement(i10);
        } else {
            this.f115518W = this.f115520Y.getKeyProgressIncrement();
        }
        this.f115520Y.setProgress(this.f115515T - this.f115516U);
        D1(this.f115515T);
        this.f115520Y.setEnabled(O());
    }

    @Override // androidx.preference.Preference
    @Nullable
    public Object h0(@NonNull TypedArray typedArray, int i10) {
        return Integer.valueOf(typedArray.getInt(i10, 0));
    }

    @Override // androidx.preference.Preference
    public void l0(@Nullable Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.l0(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.l0(savedState.getSuperState());
        this.f115515T = savedState.mSeekBarValue;
        this.f115516U = savedState.mMin;
        this.f115517V = savedState.mMax;
        X();
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
        savedState.mSeekBarValue = this.f115515T;
        savedState.mMin = this.f115516U;
        savedState.mMax = this.f115517V;
        return savedState;
    }

    @Override // androidx.preference.Preference
    public void n0(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        A1(A(((Integer) obj).intValue()));
    }

    public int n1() {
        return this.f115517V;
    }

    public int o1() {
        return this.f115516U;
    }

    public final int p1() {
        return this.f115518W;
    }

    public boolean q1() {
        return this.f115523b0;
    }

    public boolean r1() {
        return this.f115524c0;
    }

    public int s1() {
        return this.f115515T;
    }

    public boolean t1() {
        return this.f115522a0;
    }

    public void u1(boolean z10) {
        this.f115522a0 = z10;
    }

    public final void v1(int i10) {
        int i11 = this.f115516U;
        if (i10 < i11) {
            i10 = i11;
        }
        if (i10 != this.f115517V) {
            this.f115517V = i10;
            X();
        }
    }

    public void w1(int i10) {
        int i11 = this.f115517V;
        if (i10 > i11) {
            i10 = i11;
        }
        if (i10 != this.f115516U) {
            this.f115516U = i10;
            X();
        }
    }

    public final void x1(int i10) {
        if (i10 != this.f115518W) {
            this.f115518W = Math.min(this.f115517V - this.f115516U, Math.abs(i10));
            X();
        }
    }

    public void y1(boolean z10) {
        this.f115523b0 = z10;
        X();
    }

    public void z1(boolean z10) {
        this.f115524c0 = z10;
    }

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        int mMax;
        int mMin;
        int mSeekBarValue;

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
            this.mSeekBarValue = parcel.readInt();
            this.mMin = parcel.readInt();
            this.mMax = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.mSeekBarValue);
            parcel.writeInt(this.mMin);
            parcel.writeInt(this.mMax);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public SeekBarPreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public SeekBarPreference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, w.a.f115751T, 0);
    }

    public SeekBarPreference(@NonNull Context context) {
        this(context, null);
    }
}
