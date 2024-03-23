import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Clase que representa a un estudiante con sus atributos básicos.
 */
public class Estudiante implements List<Estudiante> {
    private String name; // Nombre del estudiante
    private String phone; // Número de teléfono del estudiante
    private String email; // Correo electrónico del estudiante
    private String postalZip; // Código postal del estudiante
    private String country; // País del estudiante
    
    /**
     * Constructor de la clase Estudiante.
     * 
     * @param name Nombre del estudiante.
     * @param phone Número de teléfono del estudiante.
     * @param email Correo electrónico del estudiante.
     * @param postalZip Código postal del estudiante.
     * @param country País del estudiante.
     */
    public Estudiante(String name, String phone, String email, String postalZip, String country) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.postalZip = postalZip;
        this.country = country;
    }

    // Métodos getters y setters para acceder y modificar los atributos

    /**
     * Obtiene el nombre del estudiante.
     * 
     * @return El nombre del estudiante.
     */
    public String getName() {
        return name;
    }

    /**
     * Establece el nombre del estudiante.
     * 
     * @param name El nuevo nombre del estudiante.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Obtiene el número de teléfono del estudiante.
     * 
     * @return El número de teléfono del estudiante.
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Establece el número de teléfono del estudiante.
     * 
     * @param phone El nuevo número de teléfono del estudiante.
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Obtiene el correo electrónico del estudiante.
     * 
     * @return El correo electrónico del estudiante.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Establece el correo electrónico del estudiante.
     * 
     * @param email El nuevo correo electrónico del estudiante.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Obtiene el código postal del estudiante.
     * 
     * @return El código postal del estudiante.
     */
    public String getPostalZip() {
        return postalZip;
    }

    /**
     * Establece el código postal del estudiante.
     * 
     * @param postalZip El nuevo código postal del estudiante.
     */
    public void setPostalZip(String postalZip) {
        this.postalZip = postalZip;
    }

    /**
     * Obtiene el país del estudiante.
     * 
     * @return El país del estudiante.
     */
    public String getCountry() {
        return country;
    }

    /**
     * Establece el país del estudiante.
     * 
     * @param country El nuevo país del estudiante.
     */
    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'size'");
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
    }

    @Override
    public boolean contains(Object o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'contains'");
    }

    @Override
    public Iterator<Estudiante> iterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }

    @Override
    public Object[] toArray() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toArray'");
    }

    @Override
    public <T> T[] toArray(T[] a) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toArray'");
    }

    @Override
    public boolean add(Estudiante e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public boolean remove(Object o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'containsAll'");
    }

    @Override
    public boolean addAll(Collection<? extends Estudiante> c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addAll'");
    }

    @Override
    public boolean addAll(int index, Collection<? extends Estudiante> c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addAll'");
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeAll'");
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'retainAll'");
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clear'");
    }

    @Override
    public Estudiante get(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public Estudiante set(int index, Estudiante element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'set'");
    }

    @Override
    public void add(int index, Estudiante element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public Estudiante remove(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public int indexOf(Object o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'indexOf'");
    }

    @Override
    public int lastIndexOf(Object o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'lastIndexOf'");
    }

    @Override
    public ListIterator<Estudiante> listIterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listIterator'");
    }

    @Override
    public ListIterator<Estudiante> listIterator(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listIterator'");
    }

    @Override
    public List<Estudiante> subList(int fromIndex, int toIndex) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'subList'");
    }    
}
