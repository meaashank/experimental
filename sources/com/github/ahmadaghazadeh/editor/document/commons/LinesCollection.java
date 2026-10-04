package com.github.ahmadaghazadeh.editor.document.commons;

import androidx.annotation.NonNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class LinesCollection implements Serializable, Iterable<LineObject> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList<LineObject> f150534a;

    public LinesCollection() {
        ArrayList<LineObject> arrayList = new ArrayList<>();
        this.f150534a = arrayList;
        arrayList.add(new LineObject(0));
    }

    public void b(int i10, int i11) {
        if (this.f150534a.size() <= 0 || i10 != 0) {
            this.f150534a.add(i10, new LineObject(i11));
        }
    }

    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public LinesCollection clone() {
        LinesCollection linesCollection = new LinesCollection();
        linesCollection.f150534a = (ArrayList) this.f150534a.clone();
        return linesCollection;
    }

    public int h(int i10) {
        if (i10 >= this.f150534a.size()) {
            return -1;
        }
        return this.f150534a.get(i10).d();
    }

    public LineObject i(int i10) {
        if (i10 < 0 || i10 >= this.f150534a.size()) {
            return null;
        }
        return this.f150534a.get(i10);
    }

    @Override // java.lang.Iterable
    @NonNull
    public Iterator<LineObject> iterator() {
        return this.f150534a.iterator();
    }

    public int j() {
        return this.f150534a.size();
    }

    public int k(int i10) {
        int size = this.f150534a.size() - 1;
        int i11 = 0;
        while (i11 < size) {
            int i12 = (i11 + size) / 2;
            if (i10 >= h(i12)) {
                if (i10 > h(i12)) {
                    i11 = i12 + 1;
                    if (i10 < h(i11)) {
                    }
                }
                return i12;
            }
            size = i12;
        }
        return this.f150534a.size() - 1;
    }

    public void n(int i10) {
        if (i10 != 0) {
            this.f150534a.remove(i10);
        }
    }

    public void o(int i10, int i11) {
        if (i10 <= 0 || i10 >= this.f150534a.size()) {
            return;
        }
        while (i10 < this.f150534a.size()) {
            int iH = h(i10) + i11;
            if (i10 <= 0 || iH > 0) {
                this.f150534a.get(i10).e(iH);
            } else {
                n(i10);
                i10--;
            }
            i10++;
        }
    }
}
