public class Author {
    private final String authorName;
    private final String authorSurname;

    public Author (String authorName, String authorSurname){
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }
    public String getAuthorName () {
        return authorName;
    }
    public String getAuthorSurname () {
        return authorSurname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author)) return false;

        Author author = (Author) o;

        if (getAuthorName() != null ? !getAuthorName().equals(author.getAuthorName()) : author.getAuthorName() != null)
            return false;
        return getAuthorSurname() != null ? getAuthorSurname().equals(author.getAuthorSurname()) : author.getAuthorSurname() == null;
    }

    @Override
    public int hashCode() {
        int result = getAuthorName() != null ? getAuthorName().hashCode() : 0;
        result = 31 * result + (getAuthorSurname() != null ? getAuthorSurname().hashCode() : 0);
        return result;
    }

    public String toString () {
        return " Имя писателя  " + authorName + "\n  Фамилия писателя  " + authorSurname;

    }


}
