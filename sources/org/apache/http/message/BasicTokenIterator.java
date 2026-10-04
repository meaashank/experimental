package org.apache.http.message;

import android.support.v4.media.a;
import java.util.NoSuchElementException;
import org.apache.http.HeaderIterator;
import org.apache.http.ParseException;
import org.apache.http.TokenIterator;
import org.apache.http.util.Args;

/* JADX INFO: loaded from: classes6.dex */
public class BasicTokenIterator implements TokenIterator {
    public static final String HTTP_SEPARATORS = " ,;=()<>@:\\\"/[]?{}\t";
    protected String currentHeader;
    protected String currentToken;
    protected final HeaderIterator headerIt;
    protected int searchPos = findNext(-1);

    public BasicTokenIterator(HeaderIterator headerIterator) {
        this.headerIt = (HeaderIterator) Args.notNull(headerIterator, "Header iterator");
    }

    public String createToken(String str, int i10, int i11) {
        return str.substring(i10, i11);
    }

    public int findNext(int i10) throws ParseException {
        int iFindTokenSeparator;
        if (i10 >= 0) {
            iFindTokenSeparator = findTokenSeparator(i10);
        } else {
            if (!this.headerIt.hasNext()) {
                return -1;
            }
            this.currentHeader = this.headerIt.nextHeader().getValue();
            iFindTokenSeparator = 0;
        }
        int iFindTokenStart = findTokenStart(iFindTokenSeparator);
        if (iFindTokenStart < 0) {
            this.currentToken = null;
            return -1;
        }
        int iFindTokenEnd = findTokenEnd(iFindTokenStart);
        this.currentToken = createToken(this.currentHeader, iFindTokenStart, iFindTokenEnd);
        return iFindTokenEnd;
    }

    public int findTokenEnd(int i10) {
        Args.notNegative(i10, "Search position");
        int length = this.currentHeader.length();
        do {
            i10++;
            if (i10 >= length) {
                break;
            }
        } while (isTokenChar(this.currentHeader.charAt(i10)));
        return i10;
    }

    public int findTokenSeparator(int i10) {
        int iNotNegative = Args.notNegative(i10, "Search position");
        int length = this.currentHeader.length();
        boolean z10 = false;
        while (!z10 && iNotNegative < length) {
            char cCharAt = this.currentHeader.charAt(iNotNegative);
            if (isTokenSeparator(cCharAt)) {
                z10 = true;
            } else {
                if (!isWhitespace(cCharAt)) {
                    if (isTokenChar(cCharAt)) {
                        StringBuilder sbA = a.a("Tokens without separator (pos ", iNotNegative, "): ");
                        sbA.append(this.currentHeader);
                        throw new ParseException(sbA.toString());
                    }
                    StringBuilder sbA2 = a.a("Invalid character after token (pos ", iNotNegative, "): ");
                    sbA2.append(this.currentHeader);
                    throw new ParseException(sbA2.toString());
                }
                iNotNegative++;
            }
        }
        return iNotNegative;
    }

    public int findTokenStart(int i10) {
        int iNotNegative = Args.notNegative(i10, "Search position");
        boolean z10 = false;
        while (!z10) {
            String str = this.currentHeader;
            if (str == null) {
                break;
            }
            int length = str.length();
            while (!z10 && iNotNegative < length) {
                char cCharAt = this.currentHeader.charAt(iNotNegative);
                if (isTokenSeparator(cCharAt) || isWhitespace(cCharAt)) {
                    iNotNegative++;
                } else {
                    if (!isTokenChar(this.currentHeader.charAt(iNotNegative))) {
                        StringBuilder sbA = a.a("Invalid character before token (pos ", iNotNegative, "): ");
                        sbA.append(this.currentHeader);
                        throw new ParseException(sbA.toString());
                    }
                    z10 = true;
                }
            }
            if (!z10) {
                if (this.headerIt.hasNext()) {
                    this.currentHeader = this.headerIt.nextHeader().getValue();
                    iNotNegative = 0;
                } else {
                    this.currentHeader = null;
                }
            }
        }
        if (z10) {
            return iNotNegative;
        }
        return -1;
    }

    @Override // org.apache.http.TokenIterator, java.util.Iterator
    public boolean hasNext() {
        return this.currentToken != null;
    }

    public boolean isHttpSeparator(char c10) {
        return HTTP_SEPARATORS.indexOf(c10) >= 0;
    }

    public boolean isTokenChar(char c10) {
        if (Character.isLetterOrDigit(c10)) {
            return true;
        }
        return (Character.isISOControl(c10) || isHttpSeparator(c10)) ? false : true;
    }

    public boolean isTokenSeparator(char c10) {
        return c10 == ',';
    }

    public boolean isWhitespace(char c10) {
        return c10 == '\t' || Character.isSpaceChar(c10);
    }

    @Override // java.util.Iterator
    public final Object next() throws ParseException, NoSuchElementException {
        return nextToken();
    }

    @Override // org.apache.http.TokenIterator
    public String nextToken() throws ParseException, NoSuchElementException {
        String str = this.currentToken;
        if (str == null) {
            throw new NoSuchElementException("Iteration already finished.");
        }
        this.searchPos = findNext(this.searchPos);
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Removing tokens is not supported.");
    }
}
