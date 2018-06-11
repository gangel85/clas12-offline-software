package cnuphys.magfield;

public interface IMagField {
	
	/**
	 * Checks whether the field has been set to always return zero.
	 * 
	 * @return <code>true</code> if the field is set to return zero.
	 */
	public boolean isZeroField();
	
	/**
	 * Get B1 at a given index.
	 * 
	 * @param index
	 *            the index into the field buffer.
	 * @return the B1 at the given index.
	 */
	public float getB1(int index);

	/**
	 * Get B2 at a given index.
	 * 
	 * @param index
	 *            the index into the field buffer.
	 * @return the B2 at the given index.
	 */
	public float getB2(int index);

	/**
	 * Get B3 at a given index.
	 * 
	 * @param index
	 *            the index into the field buffer.
	 * @return the B3 at the given index.
	 */
	public float getB3(int index);

	/**
	 * Get the name of the field
	 * 
	 * @return the name, e.e. "Torus"
	 */
	public abstract String getName();
	
	/**
	 * Obtain the maximum field magnitude of any point in the map.
	 * 
	 * @return the maximum field magnitude in the units of the map.
	 */
	public float getMaxFieldMagnitude();

	public double getScaleFactor();

}
