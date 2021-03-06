/*
* Copyright 2014 David Farrell <shokku.ra@gmail.com>
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

public class EmptySequence<E> implements SequenceBase<E> {
    private static final EmptySequence _empty = new EmptySequence();
    public static <T> EmptySequence<T> empty() { return _empty; }
    private EmptySequence() {}

    @Override
    public SequenceBase seq(E elem) {
        return new Sequence(elem, this);
    }

    @Override
    public E head() throws EmptySequenceException {
        throw new EmptySequenceException();
    }

    @Override
    public SequenceBase tail() throws EmptySequenceException {
        throw new EmptySequenceException();
    }
}
