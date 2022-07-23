package modelo;

public class FormularioDeBusqueda
{
	private CargaHoraria cargaHoraria;
	private EstudiosCursados estudiosCursados;
	private Experiencia experiencia;
	private Locacion locacion;
	private RangoEtario rangoEtario;
	private Remuneracion remuneracion;
	private TipoPuesto tipoPuesto;

	public CargaHoraria getCargaHoraria()
	{
		return cargaHoraria;
	}

	public EstudiosCursados getEstudiosCursados()
	{
		return estudiosCursados;
	}

	public Experiencia getExperiencia()
	{
		return experiencia;
	}

	public Locacion getLocacion()
	{
		return locacion;
	}

	public RangoEtario getRangoEtario()
	{
		return rangoEtario;
	}

	public Remuneracion getRemuneracion()
	{
		return remuneracion;
	}

	public TipoPuesto getTipoPuesto()
	{
		return tipoPuesto;
	}

	public void setCargahoraria(CargaHoraria cargahoraria)
	{
		this.cargaHoraria = cargahoraria;
	}

	public void setEstudiosCursados(EstudiosCursados estudiosCursados)
	{
		this.estudiosCursados = estudiosCursados;
	}

	public void setExperiencia(Experiencia experiencia)
	{
		this.experiencia = experiencia;
	}

	public void setLocacion(Locacion locacion)
	{
		this.locacion = locacion;
	}

	public void setRangoEtario(RangoEtario rangoEtario)
	{
		this.rangoEtario = rangoEtario;
	}

	public void setRemuneracion(Remuneracion remuneracion)
	{
		this.remuneracion = remuneracion;
	}

	public void setTipoPuesto(TipoPuesto tipoPuesto)
	{
		this.tipoPuesto = tipoPuesto;
	}

	@Override
	public String toString() {
		return "FormularioDeBusqueda [cargaHoraria=" + cargaHoraria + ", estudiosCursados=" + estudiosCursados
				+ ", experiencia=" + experiencia + ", locacion=" + locacion + ", rangoEtario=" + rangoEtario
				+ ", remuneracion=" + remuneracion + ", tipoPuesto=" + tipoPuesto + "]";
	}

}
