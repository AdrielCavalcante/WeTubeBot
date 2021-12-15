import styled from 'styled-components';

export const Grid = styled.div`
  display: grid;

  grid-template-rows: 80px auto 80px;

  grid-template-areas:
  'Navbar Container Footer' ;

  height: 100vh;
`;