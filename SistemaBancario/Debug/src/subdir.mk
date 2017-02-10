################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
CPP_SRCS += \
../src/ContaEspecial.cpp \
../src/ContaPoupanca.cpp \
../src/ContaSimples.cpp \
../src/main_heranca.cpp 

OBJS += \
./src/ContaEspecial.o \
./src/ContaPoupanca.o \
./src/ContaSimples.o \
./src/main_heranca.o 

CPP_DEPS += \
./src/ContaEspecial.d \
./src/ContaPoupanca.d \
./src/ContaSimples.d \
./src/main_heranca.d 


# Each subdirectory must supply rules for building sources it contributes
src/%.o: ../src/%.cpp
	@echo 'Building file: $<'
	@echo 'Invoking: GCC C++ Compiler'
	g++ -O0 -g3 -Wall -c -fmessage-length=0 -MMD -MP -MF"$(@:%.o=%.d)" -MT"$(@:%.o=%.d)" -o "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


