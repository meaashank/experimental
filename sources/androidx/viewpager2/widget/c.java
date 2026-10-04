package androidx.viewpager2.widget;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements ViewPager2.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<ViewPager2.m> f119957a = new ArrayList();

    public void a(@NonNull ViewPager2.m mVar) {
        this.f119957a.add(mVar);
    }

    public void b(@NonNull ViewPager2.m mVar) {
        this.f119957a.remove(mVar);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.m
    public void transformPage(@NonNull View view, float f10) {
        Iterator<ViewPager2.m> it = this.f119957a.iterator();
        while (it.hasNext()) {
            it.next().transformPage(view, f10);
        }
    }
}
