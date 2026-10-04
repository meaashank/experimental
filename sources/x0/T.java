package X0;

import android.annotation.SuppressLint;
import android.os.Parcelable;
import android.view.View;
import android.view.accessibility.AccessibilityRecord;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccessibilityRecord f76696a;

    @Deprecated
    public T(Object obj) {
        this.f76696a = (AccessibilityRecord) obj;
    }

    @Deprecated
    public static T A(T t10) {
        return new T(AccessibilityRecord.obtain(t10.f76696a));
    }

    @e.S(expression = "record.setMaxScrollX(maxScrollX)")
    @Deprecated
    public static void N(@NonNull AccessibilityRecord accessibilityRecord, int i10) {
        accessibilityRecord.setMaxScrollX(i10);
    }

    @e.S(expression = "record.setMaxScrollY(maxScrollY)")
    @Deprecated
    public static void P(@NonNull AccessibilityRecord accessibilityRecord, int i10) {
        accessibilityRecord.setMaxScrollY(i10);
    }

    @e.S(expression = "record.setSource(root, virtualDescendantId)")
    @Deprecated
    public static void Y(@NonNull AccessibilityRecord accessibilityRecord, @Nullable View view, int i10) {
        accessibilityRecord.setSource(view, i10);
    }

    @e.S(expression = "record.getMaxScrollX()")
    @Deprecated
    public static int j(@NonNull AccessibilityRecord accessibilityRecord) {
        return accessibilityRecord.getMaxScrollX();
    }

    @e.S(expression = "record.getMaxScrollY()")
    @Deprecated
    public static int l(@NonNull AccessibilityRecord accessibilityRecord) {
        return accessibilityRecord.getMaxScrollY();
    }

    @Deprecated
    public static T z() {
        return new T(AccessibilityRecord.obtain());
    }

    @Deprecated
    public void B() {
        this.f76696a.recycle();
    }

    @Deprecated
    public void C(int i10) {
        this.f76696a.setAddedCount(i10);
    }

    @Deprecated
    public void D(CharSequence charSequence) {
        this.f76696a.setBeforeText(charSequence);
    }

    @Deprecated
    public void E(boolean z10) {
        this.f76696a.setChecked(z10);
    }

    @Deprecated
    public void F(CharSequence charSequence) {
        this.f76696a.setClassName(charSequence);
    }

    @Deprecated
    public void G(CharSequence charSequence) {
        this.f76696a.setContentDescription(charSequence);
    }

    @Deprecated
    public void H(int i10) {
        this.f76696a.setCurrentItemIndex(i10);
    }

    @Deprecated
    public void I(boolean z10) {
        this.f76696a.setEnabled(z10);
    }

    @Deprecated
    public void J(int i10) {
        this.f76696a.setFromIndex(i10);
    }

    @Deprecated
    public void K(boolean z10) {
        this.f76696a.setFullScreen(z10);
    }

    @Deprecated
    public void L(int i10) {
        this.f76696a.setItemCount(i10);
    }

    @Deprecated
    public void M(int i10) {
        this.f76696a.setMaxScrollX(i10);
    }

    @Deprecated
    public void O(int i10) {
        this.f76696a.setMaxScrollY(i10);
    }

    @Deprecated
    public void Q(Parcelable parcelable) {
        this.f76696a.setParcelableData(parcelable);
    }

    @Deprecated
    public void R(boolean z10) {
        this.f76696a.setPassword(z10);
    }

    @Deprecated
    public void S(int i10) {
        this.f76696a.setRemovedCount(i10);
    }

    @Deprecated
    public void T(int i10) {
        this.f76696a.setScrollX(i10);
    }

    @Deprecated
    public void U(int i10) {
        this.f76696a.setScrollY(i10);
    }

    @Deprecated
    public void V(boolean z10) {
        this.f76696a.setScrollable(z10);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    @Deprecated
    public void W(View view) {
        this.f76696a.setSource(view);
    }

    @Deprecated
    public void X(View view, int i10) {
        this.f76696a.setSource(view, i10);
    }

    @Deprecated
    public void Z(int i10) {
        this.f76696a.setToIndex(i10);
    }

    @Deprecated
    public int a() {
        return this.f76696a.getAddedCount();
    }

    @Deprecated
    public CharSequence b() {
        return this.f76696a.getBeforeText();
    }

    @Deprecated
    public CharSequence c() {
        return this.f76696a.getClassName();
    }

    @Deprecated
    public CharSequence d() {
        return this.f76696a.getContentDescription();
    }

    @Deprecated
    public int e() {
        return this.f76696a.getCurrentItemIndex();
    }

    @Deprecated
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T)) {
            return false;
        }
        T t10 = (T) obj;
        AccessibilityRecord accessibilityRecord = this.f76696a;
        return accessibilityRecord == null ? t10.f76696a == null : accessibilityRecord.equals(t10.f76696a);
    }

    @Deprecated
    public int f() {
        return this.f76696a.getFromIndex();
    }

    @Deprecated
    public Object g() {
        return this.f76696a;
    }

    @Deprecated
    public int h() {
        return this.f76696a.getItemCount();
    }

    @Deprecated
    public int hashCode() {
        AccessibilityRecord accessibilityRecord = this.f76696a;
        if (accessibilityRecord == null) {
            return 0;
        }
        return accessibilityRecord.hashCode();
    }

    @Deprecated
    public int i() {
        return this.f76696a.getMaxScrollX();
    }

    @Deprecated
    public int k() {
        return this.f76696a.getMaxScrollY();
    }

    @Deprecated
    public Parcelable m() {
        return this.f76696a.getParcelableData();
    }

    @Deprecated
    public int n() {
        return this.f76696a.getRemovedCount();
    }

    @Deprecated
    public int o() {
        return this.f76696a.getScrollX();
    }

    @Deprecated
    public int p() {
        return this.f76696a.getScrollY();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    @Deprecated
    public AccessibilityNodeInfoCompat q() {
        return AccessibilityNodeInfoCompat.s2(this.f76696a.getSource());
    }

    @Deprecated
    public List<CharSequence> r() {
        return this.f76696a.getText();
    }

    @Deprecated
    public int s() {
        return this.f76696a.getToIndex();
    }

    @Deprecated
    public int t() {
        return this.f76696a.getWindowId();
    }

    @Deprecated
    public boolean u() {
        return this.f76696a.isChecked();
    }

    @Deprecated
    public boolean v() {
        return this.f76696a.isEnabled();
    }

    @Deprecated
    public boolean w() {
        return this.f76696a.isFullScreen();
    }

    @Deprecated
    public boolean x() {
        return this.f76696a.isPassword();
    }

    @Deprecated
    public boolean y() {
        return this.f76696a.isScrollable();
    }
}
