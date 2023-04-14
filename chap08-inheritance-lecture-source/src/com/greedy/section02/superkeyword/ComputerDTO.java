package com.greedy.section02.superkeyword;

import java.util.Date;

public class ComputerDTO extends ProductDTO{

	/* ComputerDTO 클래스는 하나의 상품이다 (IS-A) */
	
	private String cpu;
	private int hdd;
	private int ram;
	private String operationSystem;
	
	/* 기본생성자 */
	public ComputerDTO() {}

	/* 부모 기본생성자를 호출하고 나머지 자식클래스의 필드를 초기화함 */
	public ComputerDTO(String cpu, int hdd, int ram, String operationSystem) {
		super();
		this.cpu = cpu;
		this.hdd = hdd;
		this.ram = ram;
		this.operationSystem = operationSystem;
	}


	public ComputerDTO(String code, String brand, String name, int price, Date manufacturingDate,
			String cpu, int hdd, int ram, String operationSystem) {
		/* 부모의 모든 필드를 초기화하는 생성자로 ProductDTO 클래스가 가진 필드를 초기화 할 값 전달 */
		super(code, brand, name, price, manufacturingDate);
		
		//this(cpu, hdd, ram, operationSystem);
		/* 위처럼 하고 싶지만 this()로 위에 작성한 생성자를 호출한다는 의미는 super()를 두번 호출하는 것과 같기 때문에
		 * 허용되지 않는다.
		 * 부모인스턴스를 두 개 생성할 수 없기 때문에 부모 생성자는 한 번만 호출 가능하다.
		 * */
		this.cpu = cpu;
		this.hdd = hdd;
		this.ram = ram;
		this.operationSystem = operationSystem;
		
		System.out.println("ComputerDTO 클래스의 부모 필드도 초기화하는 생성자 호출함");
		
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public int getHdd() {
		return hdd;
	}

	public void setHdd(int hdd) {
		this.hdd = hdd;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getOperationSystem() {
		return operationSystem;
	}

	public void setOperationSystem(String operationSystem) {
		this.operationSystem = operationSystem;
	}

	@Override
	public String getInformation() {
//		return "code = " + super.getCode() +
//				", brand = " + super.getBrand() +
//				", name = " + super.getName() +
//				", price = " + super.getPrice() +
//				", manufacturingDate = "+ super.getManufacturingDate() +
//				"cpu = " + cpu + ", hdd = " + hdd + ", ram = " + ram + ", operationSystem = " + operationSystem;
		
		return super.getInformation()
				+"cpu = " + cpu + ", hdd = " + hdd + ", ram = " + ram + ", operationSystem = " + operationSystem;
	}

	
	
	
	
}
