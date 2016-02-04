package com.unir.leonardotalero.fragmentos.clases;

import com.unir.leonardotalero.fragmentos.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class LibroContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<Libro> ITEMS = new ArrayList<Libro>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, Libro> ITEM_MAP = new HashMap<String, Libro>();

    private static final int COUNT = 5;

    static {

        int vari = R.drawable.agameofthrones;
        addItem(
        createLibroItem("A Game of Thrones", "is the first novel in A Song of Ice and Fire, a series of high fantasy" +
                        " novels by American author George R. R. Martin. It was first published on August 6, 1996. " +
                        "The novel won the 1997 Locus Award[1] " +
                        "and was nominated for both the 1997 Nebula Award[1] and the 1997 World Fantasy Award.[2] " +
                        "The novella Blood of the Dragon, comprising the Daenerys Targaryen chapters from the novel," +
                        " won the 1997 Hugo Award for Best Novella. In January 2011 the novel became a New York Times" +
                        " bestseller[3] and reached #1 on the list in July 2011",
                vari)
        );

         vari = R.drawable.aclashofkings;
        addItem(
                createLibroItem("A Clash of Kings", "A Clash of Kings is the second novel in A Song of Ice and Fire, an epic " +
                                "fantasy series by American author George R. R. Martin expected to consist of seven volumes. " +
                                "It was first published on 16 November 1998 in the United Kingdom, although the first United " +
                                "States edition did not follow until March 1999. Like its predecessor, A Game of Thrones," +
                                " it won the Locus Award (in 1999) for Best Novel and was nominated for the Nebula Award (also in 1999) for best novel. " +
                                "In May 2005 Meisha Merlin released a limited edition of the novel, fully illustrated by John Howe",
                        vari)
        );
        vari = R.drawable.astormofswords;
        addItem(
                createLibroItem("A Storm of Swords", "A Storm of Swords is the third of seven planned novels in A Song " +
                                "of Ice and Fire, a fantasy series by American author George R. R. Martin. It was first" +
                                " published on 8 August 2000 in the United Kingdom,[1] with a United States edition following " +
                                "in November 2000. Its publication was preceded by a novella called Path of the Dragon, " +
                                "which collects some of the Daenerys Targaryen chapters from the novel into a single book.",
                        vari)
        );
        vari = R.drawable.afeastforcrows;
        addItem(
                createLibroItem("A Feast for Crows", "A Feast for Crows is the fourth of seven planned novels" +
                                " in the epic fantasy series A Song of Ice and Fire by American author George R. R. Martin." +
                                " The novel was first" +
                                " published on 17 October 2005 in the United Kingdom, with a United States edition " +
                                "following on 8 November 2005.",
                        vari)
        );
        vari = R.drawable.adancewithdragons;
        addItem(
                createLibroItem("A Dance with Dragons", "A Dance with Dragons is the fifth of seven planned" +
                                " novels in the epic fantasy series A Song of Ice and Fire by American author George R. R. Martin." +
                                " In some areas the paperback edition was published in two parts titled Dreams and Dust and After the Feast. " +
                                "It is the first novel in the series to " +
                                "be published following the commencement of the HBO series adaptation, Game of Thrones",
                        vari)
        );
        /*
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createDummyItem(i));
        }
        */
    }

    private static void addItem(Libro item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.nombre, item);
    }

    private static Libro createLibroItem(String nombre,String descripcion,int imagen) {

        return new Libro(nombre,descripcion,imagen);
    }


    /**
     * A dummy item representing a piece of content.
     */
    /*
    public static class DummyItem {
        public final String id;
        public final String content;
        public final String details;

        public DummyItem(String id, String content, String details) {
            this.id = id;
            this.content = content;
            this.details = details;
        }

        @Override
        public String toString() {
            return content;
        }
    }
    */
}
