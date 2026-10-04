package com.cookiegames.smartcookie.browser;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class SearchBoxDisplayChoice implements u4.d {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ SearchBoxDisplayChoice[] $VALUES;
    private final int value;
    public static final SearchBoxDisplayChoice URL = new SearchBoxDisplayChoice("URL", 0, 0);
    public static final SearchBoxDisplayChoice DOMAIN = new SearchBoxDisplayChoice("DOMAIN", 1, 1);
    public static final SearchBoxDisplayChoice TITLE = new SearchBoxDisplayChoice("TITLE", 2, 2);

    private static final /* synthetic */ SearchBoxDisplayChoice[] $values() {
        return new SearchBoxDisplayChoice[]{URL, DOMAIN, TITLE};
    }

    static {
        SearchBoxDisplayChoice[] searchBoxDisplayChoiceArr$values = $values();
        $VALUES = searchBoxDisplayChoiceArr$values;
        $ENTRIES = kotlin.enums.c.c(searchBoxDisplayChoiceArr$values);
    }

    private SearchBoxDisplayChoice(String str, int i10, int i11) {
        this.value = i11;
    }

    @NotNull
    public static kotlin.enums.a<SearchBoxDisplayChoice> getEntries() {
        return $ENTRIES;
    }

    public static SearchBoxDisplayChoice valueOf(String str) {
        return (SearchBoxDisplayChoice) Enum.valueOf(SearchBoxDisplayChoice.class, str);
    }

    public static SearchBoxDisplayChoice[] values() {
        return (SearchBoxDisplayChoice[]) $VALUES.clone();
    }

    @Override // u4.d
    public int getValue() {
        return this.value;
    }
}
