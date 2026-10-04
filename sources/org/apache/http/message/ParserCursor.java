package org.apache.http.message;

import android.support.v4.media.a;
import kotlin.text.X;

/* JADX INFO: loaded from: classes6.dex */
public class ParserCursor {
    private final int lowerBound;
    private int pos;
    private final int upperBound;

    public ParserCursor(int i10, int i11) {
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("Lower bound cannot be negative");
        }
        if (i10 > i11) {
            throw new IndexOutOfBoundsException("Lower bound cannot be greater then upper bound");
        }
        this.lowerBound = i10;
        this.upperBound = i11;
        this.pos = i10;
    }

    public boolean atEnd() {
        return this.pos >= this.upperBound;
    }

    public int getLowerBound() {
        return this.lowerBound;
    }

    public int getPos() {
        return this.pos;
    }

    public int getUpperBound() {
        return this.upperBound;
    }

    public String toString() {
        return "[" + Integer.toString(this.lowerBound) + X.f218304f + Integer.toString(this.pos) + X.f218304f + Integer.toString(this.upperBound) + ']';
    }

    public void updatePos(int i10) {
        if (i10 < this.lowerBound) {
            StringBuilder sbA = a.a("pos: ", i10, " < lowerBound: ");
            sbA.append(this.lowerBound);
            throw new IndexOutOfBoundsException(sbA.toString());
        }
        if (i10 <= this.upperBound) {
            this.pos = i10;
        } else {
            StringBuilder sbA2 = a.a("pos: ", i10, " > upperBound: ");
            sbA2.append(this.upperBound);
            throw new IndexOutOfBoundsException(sbA2.toString());
        }
    }
}
