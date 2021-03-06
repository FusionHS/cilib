/**           __  __
 *    _____ _/ /_/ /_    Computational Intelligence Library (CIlib)
 *   / ___/ / / / __ \   (c) CIRG @ UP
 *  / /__/ / / / /_/ /   http://cilib.net
 *  \___/_/_/_/_.___/
 */
package net.sourceforge.cilib.util.selection;

import java.util.List;

/**
 *
 */
public interface Selectable<T> {

    /**
     * Return the first element within the result of matching elements.
     * @return
     */
    T select();

    /**
     * Return the list of matching elements.
     * @param predicate
     * @return
     */
    List<T> select(Samples predicate);
}
